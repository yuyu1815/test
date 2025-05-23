/*    */ package ai.grazie.nlp.tokenizer;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.spacy.SpacyTokenizerCharClasses;
/*    */ import ai.grazie.utils.mpp.Platform;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.text.Regex;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\t"}, d2 = {"Lai/grazie/nlp/tokenizer/SpacyDefaults;", "", "()V", "UrlMatch", "Lkotlin/text/Regex;", "getUrlMatch", "()Lkotlin/text/Regex;", "UrlPattern", "", "nlp-tokenizer"})
/*    */ public final class SpacyDefaults {
/* 13 */   static { String[] arrayOfString = new String[23]; arrayOfString[0] = "^"; arrayOfString[1] = 
/*    */ 
/*    */       
/* 16 */       "(?:(?:[\\w\\+\\-\\.]{2,}):\\/\\/)?";
/*    */     
/* 18 */     arrayOfString[2] = "(?:\\S+(?::\\S*)?@)?";
/* 19 */     arrayOfString[3] = "(?:";
/*    */ 
/*    */     
/* 22 */     arrayOfString[4] = "(?!(?:10|127)(?:\\.\\d{1,3}){3})";
/* 23 */     arrayOfString[5] = "(?!(?:169\\.254|192\\.168)(?:\\.\\d{1,3}){2})";
/* 24 */     arrayOfString[6] = "(?!172\\.(?:1[6-9]|2\\d|3[0-1])(?:\\.\\d{1,3}){2})";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     arrayOfString[7] = "(?:[1-9]\\d?|1\\d\\d|2[01]\\d|22[0-3])";
/* 33 */     arrayOfString[8] = "(?:\\.(?:1?\\d{1,2}|2[0-4]\\d|25[0-5])){2}";
/* 34 */     arrayOfString[9] = "(?:\\.(?:[1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-4]))";
/* 35 */     arrayOfString[10] = "|";
/*    */ 
/*    */     
/* 38 */     arrayOfString[11] = "(?:";
/* 39 */     arrayOfString[12] = "(?:";
/* 40 */     arrayOfString[13] = "[A-Za-z0-9\\u00a1-\\uffff]";
/* 41 */     arrayOfString[14] = "[A-Za-z0-9\\u00a1-\\uffff_-]{0,62}";
/* 42 */     arrayOfString[15] = ")?";
/* 43 */     arrayOfString[16] = "[A-Za-z0-9\\u00a1-\\uffff]\\.";
/* 44 */     arrayOfString[17] = ")+";
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     arrayOfString[18] = "(?:[" + SpacyTokenizerCharClasses.INSTANCE.getAlphaLower() + "]{2,63})";
/* 50 */     arrayOfString[19] = ")";
/*    */     
/* 52 */     arrayOfString[20] = "(?::\\d{2,5})?";
/*    */     
/* 54 */     arrayOfString[21] = "(?:[/?#]\\S*)?";
/* 55 */     arrayOfString[22] = "$";
/*    */     
/* 57 */     UrlPattern = StringsKt.trim(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[])arrayOfString), "", null, null, 0, null, null, 62, null)).toString(); } @NotNull public static final SpacyDefaults INSTANCE = new SpacyDefaults(); @NotNull
/*    */   private static final String UrlPattern; @NotNull
/* 59 */   private static final Regex UrlMatch = new Regex(
/* 60 */       (Platform.Companion.getCurrent() == Platform.JS) ? 
/* 61 */       StringsKt.replace$default(UrlPattern, "\\x", "\\u", false, 4, null) : 
/*    */       
/* 63 */       UrlPattern);
/*    */   
/*    */   @NotNull
/*    */   public final Regex getUrlMatch() {
/*    */     return UrlMatch;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\SpacyDefaults.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */