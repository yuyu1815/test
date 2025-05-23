/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.intellij.openapi.util.SystemInfo;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\000\n\002\020\016\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\016\020\f\032\0020\0052\006\020\006\032\0020\007R\016\020\b\032\0020\007XT¢\006\002\n\000R\016\020\t\032\0020\007XT¢\006\002\n\000R\016\020\n\032\0020\007XT¢\006\002\n\000R\016\020\013\032\0020\007XT¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner_VersionDependent$Companion;", "", "<init>", "()V", "isPowerShell", "", "shellName", "", "BASH_NAME", "SH_NAME", "ZSH_NAME", "FISH_NAME", "isBashZshFish", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   public final boolean isPowerShell(@NotNull String shellName) {
/* 17 */     Intrinsics.checkNotNullParameter(shellName, "shellName"); return (StringsKt.equals(shellName, "powershell", true) || 
/* 18 */       StringsKt.equals(shellName, "powershell.exe", true) || 
/* 19 */       StringsKt.equals(shellName, "pwsh", true) || 
/* 20 */       StringsKt.equals(shellName, "pwsh.exe", true));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean isBashZshFish(@NotNull String shellName) {
/* 29 */     Intrinsics.checkNotNullParameter(shellName, "shellName"); return (Intrinsics.areEqual(shellName, "bash") || (SystemInfo.isMac && Intrinsics.areEqual(shellName, "sh")) || 
/* 30 */       Intrinsics.areEqual(shellName, "zsh") || Intrinsics.areEqual(shellName, "fish"));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\JunieTerminalRunner_VersionDependent$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */