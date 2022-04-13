package Test.deepandshallowcopy.bdeepCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Major implements Cloneable{
    private String majorName; // 专业名称
    private long majorId;     // 专业代号

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
