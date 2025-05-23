/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*    */ @JvmInline
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\004\b@\030\000 \0242\0020\001:\001\024B\024\022\013\020\002\032\0070\003¢\006\002\b\004¢\006\004\b\005\020\006J\017\020\t\032\0020\003H\026¢\006\004\b\n\020\006J\032\020\013\032\0020\f2\b\020\r\032\004\030\0010\001HÖ\003¢\006\004\b\016\020\017J\020\020\020\032\0020\021HÖ\001¢\006\004\b\022\020\023R\026\020\002\032\0070\003¢\006\002\b\004¢\006\b\n\000\032\004\b\007\020\b\001\002¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUserId;", "", "value", "", "Lorg/jetbrains/annotations/NonNls;", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "Companion", "data.model"})
/*    */ @SourceDebugExtension({"SMAP\nJbaUserId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JbaUserId.kt\ncom/intellij/ml/llm/matterhorn/activation/data/model/JbaUserId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
/*    */ public final class JbaUserId { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*  7 */   public final String getValue() { return this.value; } @NotNull
/*    */   private final String value; @NotNull
/*  9 */   public static String constructor-impl(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); String str = value; if (!(!StringsKt.isBlank(str) ? 1 : 0)) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 17 */       int $i$a$-require-JbaUserId$1 = 0;
/*    */       String str1 = "JBA user ID cannot be blank";
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
/*    */     return !(other instanceof JbaUserId) ? false : (!!Intrinsics.areEqual(arg0, ((JbaUserId)other).unbox-impl()));
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
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUserId$Companion;", "", "<init>", "()V", "data.model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\JbaUserId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */