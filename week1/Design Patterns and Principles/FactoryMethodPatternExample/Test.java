abstract class WordDocument {
    public abstract void create();
}

abstract class PdfDocument {
    public abstract void create();
}

abstract class ExcelDocument {
    public abstract void create();
}

class ConcreteWordDocument extends WordDocument {
    @Override
    public void create() {
        System.out.println("creating a Word document.");
    }
}

class ConcretePdfDocument extends PdfDocument {
    @Override
    public void create() {
        System.out.println("creating a PDF document.");
    }
}

class ConcreteExcelDocument extends ExcelDocument {
    @Override
    public void create() {
        System.out.println("creating an Excel document.");
    }
}

abstract class DocumentFactory {
    public abstract Object createDocument(); // using Object since each document type is different
}

class WordDocumentFactory extends DocumentFactory {
    @Override
    public WordDocument createDocument() {
        return new ConcreteWordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    @Override
    public PdfDocument createDocument() {
        return new ConcretePdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public ExcelDocument createDocument() {
        return new ConcreteExcelDocument();
    }
}

public class Test {
    public static void main(String[] args) {
        // Word Document
        WordDocumentFactory wordFactory = new WordDocumentFactory();
        WordDocument wordDoc = wordFactory.createDocument();
        wordDoc.create();

        // PDF Document
        PdfDocumentFactory pdfFactory = new PdfDocumentFactory();
        PdfDocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.create();

        // Excel Document
        ExcelDocumentFactory excelFactory = new ExcelDocumentFactory();
        ExcelDocument excelDoc = excelFactory.createDocument();
        excelDoc.create();
    }
}
