/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.util.PlatformUtils;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\n\002\020\013\n\000\b\002\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\013\032\0020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ActionType;", "", "title", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "Terminal", "RunTests", "Build", "isWhitelistSupported", "", "core"})
/*    */ public enum ActionType
/*    */ {
/*    */   @NotNull
/*    */   private final String title;
/*    */   
/*    */   ActionType(String title) {
/*    */     this.title = title;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getTitle() {
/*    */     return this.title;
/*    */   }
/*    */   
/* 75 */   Terminal("Terminal"), RunTests("RunTests"), Build("Build");
/*    */   
/*    */   public final boolean isWhitelistSupported() {
/* 78 */     switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) { case 1: 
/*    */       case 2: case 3:
/* 80 */         return (PlatformUtils.isIntelliJ() || Intrinsics.areEqual(PlatformUtils.getPlatformPrefix(), "AndroidStudio")); }
/*    */     
/* 82 */     throw new NoWhenBranchMatchedException(); } @NotNull public static EnumEntries<ActionType> getEntries() { return $ENTRIES; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ActionType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */