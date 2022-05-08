package GDeepandshallowcopy.cdeepCopyBySerializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Major implements Serializable {
    private String majorName; // 专业名称
    private long majorId;     // 专业代号
}
