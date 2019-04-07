package com.jw.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.jw.xml.factories.EventFactory;
import com.jw.xml.models.Event;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XmlApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void whenJavaSerializedToXmlStr_thenCorrect() throws JsonProcessingException {
		XmlMapper xmlMapper = new XmlMapper();
		String xml = xmlMapper.writeValueAsString(new SimpleBean());
		assertNotNull(xml);
	}

	@Test
	public void whenJavaSerializedToXmlFile_thenCorrect() throws IOException {
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.writeValue(new File("simple_bean.xml"), new SimpleBean());
		File file = new File("simple_bean.xml");
		assertNotNull(file);
	}

	@Test
	public void JacksonGenerateEventsToXML() throws IOException {
		EventFactory eventFactory = new EventFactory();
		List<Event> events = eventFactory.createEvents(3);
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.writeValue(new File("xml/test/jackson-events.xml"), events);
		File file = new File("xml/test/jackson-events.xml");
		assertNotNull(file);
	}

	@Test
	public  void JAXBGenerateEventsToXML() throws JAXBException {
		File file = new File("xml/test/jaxb-events.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Event.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		EventFactory eventFactory = new EventFactory();
		List<Event> events = eventFactory.createEvents(3);

		jaxbMarshaller.marshal(events.get(0), file);
		assertNotNull(file);
	}
}
