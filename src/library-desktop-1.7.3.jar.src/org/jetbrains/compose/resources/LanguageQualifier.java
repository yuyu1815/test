/*    */ package org.jetbrains.compose.resources;
/*    */ @InternalResourceApi
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lorg/jetbrains/compose/resources/LanguageQualifier;", "Lorg/jetbrains/compose/resources/Qualifier;", "language", "", "(Ljava/lang/String;)V", "getLanguage", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "library"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class LanguageQualifier implements Qualifier { @NotNull
/*    */   private final String language;
/*  7 */   public LanguageQualifier(@NotNull String language) { this.language = language; } public static final int $stable; @NotNull public final String getLanguage() { return this.language; }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 10 */     if (this == other) return true; 
/* 11 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 13 */     (LanguageQualifier)other;
/*    */     
/* 15 */     return Intrinsics.areEqual(this.language, ((LanguageQualifier)other).language);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 19 */     return this.language.hashCode();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 23 */     return "LanguageQualifier(language='" + this.language + "')";
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\LanguageQualifier.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */