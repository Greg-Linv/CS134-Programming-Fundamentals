import java.io.*;

public class FileOutputter
{
    private BufferedWriter m_writer;
    private String m_filename;
    
    public FileOutputter()
    {
        m_filename = "default.txt";
    }
    
    public FileOutputter( String filename )
    {
        m_filename = filename;
    }
    
    public void print( String text )
    {
        openFile( m_filename );
        
        try
        {
            m_writer.write( text );
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
        
        closeFile();
    }
    
    public void println( String text )
    {
        print( text + "\n" );
    }
    
    private void openFile( String filename )
    {
        try
        {
            File file = new File( filename );
            m_writer = new BufferedWriter(
                new FileWriter( file.getAbsoluteFile(), true )
            );
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
    }
    
    private void closeFile()
    {
        try
        {
            m_writer.close();
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }
    }
}
