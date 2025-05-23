/*   */ package org.jetbrains.compose.resources;
/*   */ 
/*   */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\007\030\0002\0060\001j\002`\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005¨\006\006"}, d2 = {"Lorg/jetbrains/compose/resources/MissingResourceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "path", "", "(Ljava/lang/String;)V", "library"})
/*   */ @StabilityInferred(parameters = 1)
/*   */ public final class MissingResourceException extends Exception {
/*   */   public MissingResourceException(@NotNull String path) {
/* 7 */     super("Missing resource with path: " + path);
/*   */   }
/*   */   
/*   */   public static final int $stable;
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\MissingResourceException.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */