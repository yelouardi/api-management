package com.humanup.matrix.ui.apimanagement.vo;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(of= {"choiceText","percentage","questionId"})
public class ChoiceVO {
     String choiceText;
     int percentage;
     QuestionVO questionId;
}

