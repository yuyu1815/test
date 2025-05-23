/*    */ package ai.grazie.nlp.utils;
/*    */ import kotlin.text.CharCategory;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\f\n\002\b\003\n\002\020\"\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\013\032\0020\f2\006\020\r\032\0020\004J\016\020\016\032\0020\f2\006\020\r\032\0020\004R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000¨\006\017"}, d2 = {"Lai/grazie/nlp/utils/CharUtils;", "", "()V", "SOFT_HYPHEN", "", "getSOFT_HYPHEN", "()C", "controlChars", "", "Lkotlin/text/CharCategory;", "punctuationChars", "isControl", "", "char", "isPunctuation", "nlp-common"})
/*    */ public final class CharUtils {
/*    */   @NotNull
/*  8 */   public static final CharUtils INSTANCE = new CharUtils(); @NotNull
/*  9 */   private static final Set<CharCategory> controlChars; static { CharCategory[] arrayOfCharCategory = new CharCategory[5]; arrayOfCharCategory[0] = CharCategory.UNASSIGNED; arrayOfCharCategory[1] = CharCategory.CONTROL; arrayOfCharCategory[2] = 
/* 10 */       CharCategory.FORMAT; arrayOfCharCategory[3] = CharCategory.PRIVATE_USE; arrayOfCharCategory[4] = CharCategory.SURROGATE;
/*    */     
/*    */     controlChars = SetsKt.setOf((Object[])arrayOfCharCategory);
/*    */     
/* 14 */     arrayOfCharCategory = new CharCategory[7]; arrayOfCharCategory[0] = CharCategory.DASH_PUNCTUATION; arrayOfCharCategory[1] = CharCategory.CONNECTOR_PUNCTUATION; arrayOfCharCategory[2] = 
/* 15 */       CharCategory.END_PUNCTUATION; arrayOfCharCategory[3] = CharCategory.START_PUNCTUATION; arrayOfCharCategory[4] = CharCategory.OTHER_PUNCTUATION;
/* 16 */     arrayOfCharCategory[5] = CharCategory.INITIAL_QUOTE_PUNCTUATION; arrayOfCharCategory[6] = CharCategory.FINAL_QUOTE_PUNCTUATION;
/*    */     punctuationChars = SetsKt.setOf((Object[])arrayOfCharCategory); }
/*    */    @NotNull
/*    */   private static final Set<CharCategory> punctuationChars; public final boolean isPunctuation(char char) {
/* 20 */     if (punctuationChars.contains(CharsKt.getCategory(char))) {
/* 21 */       return true;
/*    */     }
/*    */     
/* 24 */     char c = char; if (!(('!' <= c) ? ((c < '0') ? 1 : 0) : 0)) { c = char; if (!((':' <= c) ? ((c < 'A') ? 1 : 0) : 0)) { c = char; if (!(('[' <= c) ? ((c < 'a') ? 1 : 0) : 0)) { c = char; if (!(('{' <= c) ? ((c < '') ? 1 : 0) : 0))
/*    */           {
/*    */             
/* 27 */             return false; }  }
/*    */          }
/*    */        }
/*    */     
/* 31 */     return true; } public final boolean isControl(char char) { switch (char) { case '\t': case '\n': case '\r':
/* 32 */         return false; }
/*    */     
/* 34 */     if (controlChars.contains(CharsKt.getCategory(char))) {
/* 35 */       return true;
/*    */     }
/* 37 */     return false; }
/*    */ 
/*    */   
/* 40 */   private static final char SOFT_HYPHEN = '­'; public final char getSOFT_HYPHEN() { return SOFT_HYPHEN; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\CharUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */