package Test.deepandshallowcopy.bdeepCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Major implements Cloneable{
    private String majorName; // רҵ����
    private long majorId;     // רҵ����

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
