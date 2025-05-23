/*    */ package com.intellij.ml.llm.matterhorn.helpers;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\002\b\003\n\002\020\t\n\002\b\005\n\002\020\013\n\002\b\004\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007J\036\020\t\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\n\032\0020\013J\036\020\f\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\n\032\0020\013J.\020\f\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\r\032\0020\0072\006\020\016\032\0020\0072\006\020\n\032\0020\013J\026\020\017\032\0020\0052\006\020\r\032\0020\0072\006\020\016\032\0020\007J\b\020\020\032\0020\021H\002J\020\020\022\032\0020\0052\006\020\023\032\0020\007H\002J\020\020\024\032\004\030\0010\007*\004\030\0010\007H\002¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;", "", "<init>", "()V", "testStarted", "", "testCase", "", "flow", "testFinished", "durationMs", "", "testFailed", "message", "details", "error", "isTeamCityVersionSet", "", "printMessage", "msg", "toTeamCityFormat", "core"})
/*    */ @SourceDebugExtension({"SMAP\nTeamCityLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TeamCityLogger.kt\ncom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,68:1\n975#2:69\n1046#2,3:70\n*S KotlinDebug\n*F\n+ 1 TeamCityLogger.kt\ncom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger\n*L\n40#1:69\n40#1:70,3\n*E\n"})
/*    */ public final class TeamCityLogger {
/*    */   @NotNull
/*    */   public static final TeamCityLogger INSTANCE = new TeamCityLogger();
/*    */   
/*    */   public final void testStarted(@NotNull String testCase, @NotNull String flow) {
/* 10 */     Intrinsics.checkNotNullParameter(testCase, "testCase"); Intrinsics.checkNotNullParameter(flow, "flow"); printMessage("testStarted name='" + toTeamCityFormat(testCase) + "' flowId='" + toTeamCityFormat(flow) + "'");
/*    */   }
/*    */   public final void testFinished(@NotNull String testCase, @NotNull String flow, long durationMs) {
/* 13 */     Intrinsics.checkNotNullParameter(testCase, "testCase"); Intrinsics.checkNotNullParameter(flow, "flow"); printMessage("testFinished name='" + toTeamCityFormat(testCase) + "' flowId='" + toTeamCityFormat(flow) + "' duration='" + durationMs + "'");
/*    */   }
/*    */   public final void testFailed(@NotNull String testCase, @NotNull String flow, long durationMs) {
/* 16 */     Intrinsics.checkNotNullParameter(testCase, "testCase"); Intrinsics.checkNotNullParameter(flow, "flow"); printMessage("testFailed name='" + toTeamCityFormat(testCase) + "' flowId='" + toTeamCityFormat(flow) + "'");
/* 17 */     printMessage("testFinished name='" + toTeamCityFormat(testCase) + "' flowId='" + toTeamCityFormat(flow) + "' duration='" + durationMs + "'");
/*    */   }
/*    */   
/*    */   public final void testFailed(@NotNull String testCase, @NotNull String flow, @NotNull String message, @NotNull String details, long durationMs) {
/* 21 */     Intrinsics.checkNotNullParameter(testCase, "testCase"); Intrinsics.checkNotNullParameter(flow, "flow"); Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(details, "details"); printMessage("testFailed name='" + toTeamCityFormat(testCase) + "' flowId='" + toTeamCityFormat(flow) + "' message='" + toTeamCityFormat(message) + "' details='" + toTeamCityFormat(details) + "'");
/* 22 */     printMessage("testFinished name='" + toTeamCityFormat(testCase) + "' flowId='" + toTeamCityFormat(flow) + "' duration='" + durationMs + "'");
/*    */   }
/*    */   
/*    */   public final void error(@NotNull String message, @NotNull String details) {
/* 26 */     Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(details, "details"); printMessage("message text='" + toTeamCityFormat(message) + "' errorDetails='" + toTeamCityFormat(details) + "' status='ERROR'");
/*    */   }
/*    */   
/*    */   private final boolean isTeamCityVersionSet() {
/* 30 */     return (System.getenv("TEAMCITY_VERSION") != null);
/*    */   }
/*    */   private final void printMessage(String msg) {
/* 33 */     if (isTeamCityVersionSet()) {
/* 34 */       System.out.println("##teamcity[" + msg + "]");
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private final String toTeamCityFormat(String $this$toTeamCityFormat) {
/* 40 */     CharSequence $this$map$iv = $this$toTeamCityFormat; int $i$f$map = 0;
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
/* 69 */     CharSequence charSequence1 = $this$map$iv; Collection destination$iv$iv = new ArrayList($this$map$iv.length()); int $i$f$mapTo = 0;
/* 70 */     for (byte b = 0; b < charSequence1.length(); ) { char item$iv$iv = charSequence1.charAt(b);
/* 71 */       char c = item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-TeamCityLogger$toTeamCityFormat$1 = 0; switch (c) { case '\'': case '\n': case '\r': case '|': case '[': case ']': 
/* 72 */         default: break; }  }  String.valueOf(c); return ($this$toTeamCityFormat != null) ? CollectionsKt.joinToString$default(destination$iv$iv, "", null, null, 0, null, null, 62, null) : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\helpers\TeamCityLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */