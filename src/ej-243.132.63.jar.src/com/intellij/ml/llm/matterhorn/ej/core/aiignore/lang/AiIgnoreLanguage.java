/*    */ package com.intellij.ml.llm.matterhorn.ej.core.aiignore.lang;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\004\030\000 \0042\0020\001:\001\004B\t\b\002¢\006\004\b\002\020\003¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/lang/AiIgnoreLanguage;", "Lcom/intellij/openapi/vcs/changes/ignore/lang/IgnoreLanguage;", "<init>", "()V", "Companion", "ej-core"})
/*    */ public final class AiIgnoreLanguage extends IgnoreLanguage {
/*  6 */   private AiIgnoreLanguage() { super("AiIgnoreJunie", "aiignore"); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\t\032\0020\005R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\006\020\003\032\004\b\007\020\bR\020\020\n\032\0020\0138\002XT¢\006\002\n\000R\020\020\f\032\0020\0138\002XT¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/lang/AiIgnoreLanguage$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/lang/AiIgnoreLanguage;", "getINSTANCE$annotations", "getINSTANCE", "()Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/lang/AiIgnoreLanguage;", "getInstance", "LANGUAGE_ID", "", "LANGUAGE_EXTENSION", "ej-core"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*  8 */     public final AiIgnoreLanguage getINSTANCE() { return AiIgnoreLanguage.INSTANCE; }
/*    */      @NotNull
/*    */     public final AiIgnoreLanguage getInstance() {
/* 11 */       return getINSTANCE();
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private static final AiIgnoreLanguage INSTANCE = new AiIgnoreLanguage();
/*    */   @NonNls
/*    */   @NotNull
/*    */   private static final String LANGUAGE_ID = "AiIgnoreJunie";
/*    */   @NonNls
/*    */   @NotNull
/*    */   private static final String LANGUAGE_EXTENSION = "aiignore";
/*    */   
/*    */   @NotNull
/*    */   public static final AiIgnoreLanguage getINSTANCE() {
/*    */     return Companion.getINSTANCE();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\aiignore\lang\AiIgnoreLanguage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */