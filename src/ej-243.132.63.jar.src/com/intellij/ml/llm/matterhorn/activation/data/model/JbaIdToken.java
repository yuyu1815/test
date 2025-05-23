/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;@JvmInline
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\004\b@\030\000 \0232\0020\001:\001\023B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\017\020\b\032\0020\003H\026¢\006\004\b\t\020\005J\032\020\n\032\0020\0132\b\020\f\032\004\030\0010\001HÖ\003¢\006\004\b\r\020\016J\020\020\017\032\0020\020HÖ\001¢\006\004\b\021\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "Companion", "data.model"})
/*    */ @SourceDebugExtension({"SMAP\nJbaIdToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JbaIdToken.kt\ncom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
/*    */ public final class JbaIdToken { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*  6 */   public final String getValue() { return this.value; } @NotNull
/*    */   private final String value; @NotNull
/*  8 */   public static String constructor-impl(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); String str = value; if (!(!StringsKt.isBlank(str) ? 1 : 0)) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 16 */       int $i$a$-require-JbaIdToken$1 = 0;
/*    */       String str1 = "JBA user token cannot be blank";
/*    */       throw new IllegalArgumentException(str1.toString());
/*    */     } 
/*    */     return str; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static String toString-impl(String arg0) {
/*    */     return LoggingKt.toRedactedString(arg0);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return toString-impl(this.value);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(String arg0) {
/*    */     return arg0.hashCode();
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.value);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(String arg0, Object other) {
/*    */     return !(other instanceof JbaIdToken) ? false : (!!Intrinsics.areEqual(arg0, ((JbaIdToken)other).unbox-impl()));
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.value, other);
/*    */   }
/*    */   
/*    */   public static final boolean equals-impl0(String p1, String p2) {
/*    */     return Intrinsics.areEqual(p1, p2);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken$Companion;", "", "<init>", "()V", "data.model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\JbaIdToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */