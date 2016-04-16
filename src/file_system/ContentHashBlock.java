package file_system;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ContentHashBlock extends Block implements Serializable {
    private byte[] data;

    public ContentHashBlock(byte[] data) {
        this.data = data;
    }


    public void setData(byte[] data){this.data = data;}
    public byte[] getData() {
        return this.data;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}
