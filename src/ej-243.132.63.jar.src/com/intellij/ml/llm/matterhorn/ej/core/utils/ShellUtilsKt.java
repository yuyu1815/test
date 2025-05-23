/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils;
/*    */ import com.intellij.openapi.util.SystemInfo;
/*    */ import com.intellij.util.PathUtil;
/*    */ import com.intellij.util.execution.ParametersListUtil;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.MatchResult;
/*    */ import kotlin.text.Regex;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\002\032\022\020\000\032\004\030\0010\0012\006\020\002\032\0020\001H\000¨\006\003"}, d2 = {"extractShellName", "", "shellPathAndParams", "ej-core"})
/*    */ public final class ShellUtilsKt {
/*    */   @Nullable
/*    */   public static final String extractShellName(@NotNull String shellPathAndParams) {
/*    */     String shellExe;
/* 18 */     Intrinsics.checkNotNullParameter(shellPathAndParams, "shellPathAndParams"); boolean allowHeuristics = (SystemInfo.isWindows || ApplicationManager.getApplication().isUnitTestMode());
/* 19 */     if (allowHeuristics && StringsKt.contains$default(shellPathAndParams, ' ', false, 2, null)) {
/* 20 */       MatchResult shouldBeShell = Regex.find$default(new Regex("[/\\\\]([^ ./\\\\]+\\.exe)(\\s|$)"), shellPathAndParams, 0, 2, null);
/* 21 */       if (shouldBeShell != null) {
/* 22 */         shouldBeShell.getGroups().get(1); return (shouldBeShell.getGroups().get(1) != null) ? shouldBeShell.getGroups().get(1).getValue() : null;
/*    */       } 
/*    */     } 
/*    */     
/* 26 */     Intrinsics.checkNotNullExpressionValue(ParametersListUtil.parse(shellPathAndParams, false, !SystemInfo.isWindows), "parse(...)"); List shellCommand = ParametersListUtil.parse(shellPathAndParams, false, !SystemInfo.isWindows);
/* 27 */     if ((String)CollectionsKt.firstOrNull(shellCommand) == null) { (String)CollectionsKt.firstOrNull(shellCommand); return null; }
/* 28 */      Intrinsics.checkNotNullExpressionValue(PathUtil.getFileName(shellExe), "getFileName(...)"); String shellName = PathUtil.getFileName(shellExe);
/* 29 */     return shellName;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\ShellUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */