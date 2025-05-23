/*    */ package org.jetbrains.compose.resources.plural;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\b\000\030\0002\0060\001j\002`\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/compose/resources/plural/PluralRuleParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "description", "", "position", "", "(Ljava/lang/String;I)V", "library"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class PluralRuleParseException extends Exception {
/*    */   public PluralRuleParseException(@NotNull String description, int position) {
/* 11 */     super("Invalid syntax at position " + position + ": " + description);
/*    */   }
/*    */   
/*    */   public static final int $stable;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\plural\PluralRuleParseException.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */