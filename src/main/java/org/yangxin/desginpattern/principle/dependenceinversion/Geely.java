package org.yangxin.desginpattern.principle.dependenceinversion;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author yangxin
 * 2020/02/25 12:18
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Geely {
    private ICourse iCourse;

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
