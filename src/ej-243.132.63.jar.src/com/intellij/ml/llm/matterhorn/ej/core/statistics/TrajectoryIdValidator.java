/*    */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*    */ import com.intellij.internal.statistic.eventLog.validator.ValidationResultType;
/*    */ import com.intellij.internal.statistic.eventLog.validator.rules.EventContext;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.Regex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\030\020\006\032\0020\0072\006\020\b\032\0020\0052\006\020\t\032\0020\nH\024¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/TrajectoryIdValidator;", "Lcom/intellij/internal/statistic/eventLog/validator/rules/impl/CustomValidationRule;", "<init>", "()V", "getRuleId", "", "doValidate", "Lcom/intellij/internal/statistic/eventLog/validator/ValidationResultType;", "data", "context", "Lcom/intellij/internal/statistic/eventLog/validator/rules/EventContext;", "ej-core"})
/*    */ public final class TrajectoryIdValidator extends CustomValidationRule {
/*    */   @NotNull
/*    */   public String getRuleId() {
/* 12 */     return "trajectory_id_validator";
/*    */   }
/*    */   @NotNull
/*    */   protected ValidationResultType doValidate(@NotNull String data, @NotNull EventContext context) {
/* 16 */     Intrinsics.checkNotNullParameter(data, "data"); Intrinsics.checkNotNullParameter(context, "context"); Regex regex = new Regex("^[\\da-f]{8}-[\\da-f]{4}-[\\da-f]{4}-[\\da-f]{4}-[\\da-f]{12}$");
/* 17 */     return 
/* 18 */       (regex.matches(data) == true) ? ValidationResultType.ACCEPTED : 
/* 19 */       ValidationResultType.REJECTED;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\TrajectoryIdValidator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */