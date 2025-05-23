/*    */ package ai.grazie.gec.model.settings;
/*    */ 
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"})
/*    */ final class StyleProfile$dropDefaults$pureEnabledRules$1$1
/*    */   extends Lambda
/*    */   implements Function1<String, Boolean>
/*    */ {
/*    */   public final Boolean invoke(String it) {
/* 47 */     Intrinsics.checkNotNullParameter(it, "it");
/* 48 */     return Boolean.valueOf((this.$predefinedEnabledRules.contains(it) || (!this.$predefinedEnabledRules.contains(it) && !this.$predefinedDisabledRules.contains(it) && StyleProfile.access$isDefaultOrUnknownRule(StyleProfile.this, this.$languageSettings, it, "enabled"))));
/*    */   }
/*    */   
/*    */   StyleProfile$dropDefaults$pureEnabledRules$1$1(Set<String> $predefinedDisabledRules, StyleProfile $receiver, Map<String, Setting> $languageSettings) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\settings\StyleProfile$dropDefaults$pureEnabledRules$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */