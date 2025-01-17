//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 09:45:12 AM CEST 
//


package org.apache.batchee.jaxb;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.apache.batchee.jaxb package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BatchArtifacts_QNAME = new QName("http://xmlns.jcp.org/xml/ns/javaee", "batch-artifacts");
    private final static QName _Job_QNAME = new QName("http://xmlns.jcp.org/xml/ns/javaee", "job");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.batchee.jaxb
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Chunk }
     */
    public Chunk createChunk() {
        return new Chunk();
    }

    /**
     * Create an instance of {@link PartitionPlan }
     */
    public PartitionPlan createPartitionPlan() {
        return new PartitionPlan();
    }

    /**
     * Create an instance of {@link ItemWriter }
     */
    public ItemWriter createItemWriter() {
        return new ItemWriter();
    }

    /**
     * Create an instance of {@link Listener }
     */
    public Listener createListener() {
        return new Listener();
    }

    /**
     * Create an instance of {@link Listeners }
     */
    public Listeners createListeners() {
        return new Listeners();
    }

    /**
     * Create an instance of {@link CheckpointAlgorithm }
     */
    public CheckpointAlgorithm createCheckpointAlgorithm() {
        return new CheckpointAlgorithm();
    }

    /**
     * Create an instance of {@link BatchArtifactRef }
     */
    public BatchArtifactRef createBatchArtifactRef() {
        return new BatchArtifactRef();
    }

    /**
     * Create an instance of {@link Decision }
     */
    public Decision createDecision() {
        return new Decision();
    }

    /**
     * Create an instance of {@link ItemProcessor }
     */
    public ItemProcessor createItemProcessor() {
        return new ItemProcessor();
    }

    /**
     * Create an instance of {@link ExceptionClassFilter }
     */
    public ExceptionClassFilter createExceptionClassFilter() {
        return new ExceptionClassFilter();
    }

    /**
     * Create an instance of {@link Fail }
     */
    public Fail createFail() {
        return new Fail();
    }

    /**
     * Create an instance of {@link PartitionMapper }
     */
    public PartitionMapper createPartitionMapper() {
        return new PartitionMapper();
    }

    /**
     * Create an instance of {@link Step }
     */
    public Step createStep() {
        return new Step();
    }

    /**
     * Create an instance of {@link JSLJob }
     */
    public JSLJob createJSLJob() {
        return new JSLJob();
    }

    /**
     * Create an instance of {@link End }
     */
    public End createEnd() {
        return new End();
    }

    /**
     * Create an instance of {@link Partition }
     */
    public Partition createPartition() {
        return new Partition();
    }

    /**
     * Create an instance of {@link Split }
     */
    public Split createSplit() {
        return new Split();
    }

    /**
     * Create an instance of {@link Next }
     */
    public Next createNext() {
        return new Next();
    }

    /**
     * Create an instance of {@link Flow }
     */
    public Flow createFlow() {
        return new Flow();
    }

    /**
     * Create an instance of {@link JSLProperties }
     */
    public JSLProperties createJSLProperties() {
        return new JSLProperties();
    }

    /**
     * Create an instance of {@link ExceptionClassFilter.Include }
     */
    public ExceptionClassFilter.Include createExceptionClassFilterInclude() {
        return new ExceptionClassFilter.Include();
    }

    /**
     * Create an instance of {@link BatchArtifacts }
     */
    public BatchArtifacts createBatchArtifacts() {
        return new BatchArtifacts();
    }

    /**
     * Create an instance of {@link Stop }
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link Analyzer }
     */
    public Analyzer createAnalyzer() {
        return new Analyzer();
    }

    /**
     * Create an instance of {@link Batchlet }
     */
    public Batchlet createBatchlet() {
        return new Batchlet();
    }

    /**
     * Create an instance of {@link ItemReader }
     */
    public ItemReader createItemReader() {
        return new ItemReader();
    }

    /**
     * Create an instance of {@link PartitionReducer }
     */
    public PartitionReducer createPartitionReducer() {
        return new PartitionReducer();
    }

    /**
     * Create an instance of {@link Property }
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link ExceptionClassFilter.Exclude }
     */
    public ExceptionClassFilter.Exclude createExceptionClassFilterExclude() {
        return new ExceptionClassFilter.Exclude();
    }

    /**
     * Create an instance of {@link Collector }
     */
    public Collector createCollector() {
        return new Collector();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchArtifacts }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/javaee", name = "batch-artifacts")
    public JAXBElement<BatchArtifacts> createBatchArtifacts(BatchArtifacts value) {
        return new JAXBElement<BatchArtifacts>(_BatchArtifacts_QNAME, BatchArtifacts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JSLJob }{@code >}}
     */
    @XmlElementDecl(namespace = "http://xmlns.jcp.org/xml/ns/javaee", name = "job")
    public JAXBElement<JSLJob> createJob(JSLJob value) {
        return new JAXBElement<JSLJob>(_Job_QNAME, JSLJob.class, null, value);
    }

}
