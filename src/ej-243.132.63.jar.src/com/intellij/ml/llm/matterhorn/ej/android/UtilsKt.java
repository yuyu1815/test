/*    */ package com.intellij.ml.llm.matterhorn.ej.android;@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\005\0320\020\000\032\0020\0012\b\020\002\032\004\030\0010\0012\b\020\003\032\004\030\0010\0012\b\020\004\032\004\030\0010\0012\b\020\005\032\004\030\0010\001H\000¨\006\006"}, d2 = {"formatAndroidTestOutput", "", "stdout", "logcat", "benchmark", "stackTrace", "ej-android"})
/*    */ @SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\ncom/intellij/ml/llm/matterhorn/ej/android/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,11:1\n1#2:12\n*E\n"})
/*    */ public final class UtilsKt {
/*    */   @NotNull
/*    */   public static final String formatAndroidTestOutput(@Nullable String stdout, @Nullable String logcat, @Nullable String benchmark, @Nullable String stackTrace) {
/*  6 */     String arrayOfString1[] = new String[4], str1 = logcat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 12 */     byte b = 0; String[] arrayOfString2 = arrayOfString1; int $i$a$-let-UtilsKt$formatAndroidTestOutput$1 = 0; String str2 = "Logcat:\n" + str1; arrayOfString1[0] = (logcat != null) ? str2 : null; String it = benchmark; b = 1; arrayOfString2 = arrayOfString1; int $i$a$-let-UtilsKt$formatAndroidTestOutput$2 = 0; str2 = "Benchmark:\n" + it; arrayOfString1[1] = (benchmark != null) ? str2 : null; it = stdout; b = 2; arrayOfString2 = arrayOfString1; int $i$a$-let-UtilsKt$formatAndroidTestOutput$3 = 0;
/*    */     str2 = "STDOUT:\n" + it;
/*    */     arrayOfString1[2] = (stdout != null) ? str2 : null;
/*    */     arrayOfString1[3] = stackTrace;
/*    */     return CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[])arrayOfString1), "\n", null, null, 0, null, null, 62, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */