/*    */ package ai.grazie.nlp.langs.utils;
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\002\030\002\n\002\b\005\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\001*\0020\0028F¢\006\006\032\004\b\006\020\004¨\006\007"}, d2 = {"englishName", "", "Lai/grazie/nlp/langs/Language;", "getEnglishName", "(Lai/grazie/nlp/langs/Language;)Ljava/lang/String;", "nativeName", "getNativeName", "nlp-langs"})
/*    */ @SourceDebugExtension({"SMAP\nNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Names.kt\nai/grazie/nlp/langs/utils/NamesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/*    */ public final class NamesKt {
/*    */   @NotNull
/*    */   public static final String getEnglishName(@NotNull Language $this$englishName) {
/*  7 */     Intrinsics.checkNotNullParameter($this$englishName, "<this>"); Intrinsics.checkNotNullExpressionValue($this$englishName.name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str1 = $this$englishName.name().toLowerCase(Locale.ROOT); char c = str1.charAt(0);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     StringBuilder stringBuilder = new StringBuilder(); int $i$a$-replaceFirstCharWithCharSequence-NamesKt$englishName$1 = 0;
/*    */     Intrinsics.checkNotNull(String.valueOf(c), "null cannot be cast to non-null type java.lang.String");
/*    */     Intrinsics.checkNotNullExpressionValue(String.valueOf(c).toUpperCase(Locale.ROOT), "toUpperCase(...)");
/*    */     String str2 = str1;
/*    */     $i$a$-replaceFirstCharWithCharSequence-NamesKt$englishName$1 = 1;
/*    */     Intrinsics.checkNotNullExpressionValue(str2.substring($i$a$-replaceFirstCharWithCharSequence-NamesKt$englishName$1), "substring(...)");
/*    */     return ((str1.length() > 0)) ? stringBuilder.append(String.valueOf(c).toUpperCase(Locale.ROOT)).append(str2.substring($i$a$-replaceFirstCharWithCharSequence-NamesKt$englishName$1)).toString() : str1;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final String getNativeName(@NotNull Language $this$nativeName) {
/*    */     Intrinsics.checkNotNullParameter($this$nativeName, "<this>");
/*    */     switch (WhenMappings.$EnumSwitchMapping$0[$this$nativeName.ordinal()]) {
/*    */       case 1:
/*    */       
/*    */       case 2:
/*    */       
/*    */       case 3:
/*    */       
/*    */       case 4:
/*    */       
/*    */       case 5:
/*    */       
/*    */       case 6:
/*    */       
/*    */       case 7:
/*    */       
/*    */       case 8:
/*    */       
/*    */       case 9:
/*    */       
/*    */       case 10:
/*    */       
/*    */       case 11:
/*    */       
/*    */       case 12:
/*    */       
/*    */       case 13:
/*    */       
/*    */       case 14:
/*    */       
/*    */       case 15:
/*    */       
/*    */       case 16:
/*    */       
/*    */       case 17:
/*    */       
/*    */       case 18:
/*    */       
/*    */       case 19:
/*    */       
/*    */       case 20:
/*    */       
/*    */       case 21:
/*    */       
/*    */       case 22:
/*    */       
/*    */       case 23:
/*    */       
/*    */       case 24:
/*    */       
/*    */       case 25:
/*    */       
/*    */       case 26:
/*    */       
/*    */       case 27:
/*    */       
/*    */       case 28:
/*    */       
/*    */       case 29:
/*    */       
/*    */       case 30:
/*    */       
/*    */       case 31:
/*    */       
/*    */       case 32:
/*    */       
/*    */     } 
/*    */     throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-langs-jvm-0.4.32.jar!\ai\grazie\nlp\lang\\utils\NamesKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */