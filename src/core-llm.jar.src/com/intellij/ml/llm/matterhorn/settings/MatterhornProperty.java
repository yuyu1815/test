/*   */ package com.intellij.ml.llm.matterhorn.settings;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\t\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\003¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\tR\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\013\020\t¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "", "name", "", "environmentVariableName", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getEnvironmentVariableName", "getDefaultValue", "core"})
/*   */ public final class MatterhornProperty {
/*   */   @NotNull
/*   */   private final String name;
/*   */   
/* 7 */   public MatterhornProperty(@NotNull String name, @NotNull String environmentVariableName, @Nullable String defaultValue) { this.name = name;
/* 8 */     this.environmentVariableName = environmentVariableName;
/* 9 */     this.defaultValue = defaultValue; } @NotNull private final String environmentVariableName; @Nullable private final String defaultValue; @NotNull public final String getName() { return this.name; } @Nullable public final String getDefaultValue() { return this.defaultValue; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String getEnvironmentVariableName() {
/*   */     return this.environmentVariableName;
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\settings\MatterhornProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */