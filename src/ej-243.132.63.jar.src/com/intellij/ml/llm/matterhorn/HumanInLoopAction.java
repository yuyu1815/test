/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\004\f\r\016\017B\023\b\004\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\004\030\0010\tX¦\004¢\006\006\032\004\b\n\020\013\001\004\020\021\022\023¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ActionType;)V", "getActionType", "()Lcom/intellij/ml/llm/matterhorn/ActionType;", "allowListActionName", "", "getAllowListActionName", "()Ljava/lang/String;", "TerminalAction", "RunTestsAction", "BuildAction", "ActionTouchingFile", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$BuildAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$RunTestsAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$TerminalAction;", "core"})
/*     */ public abstract class HumanInLoopAction
/*     */ {
/*     */   @Nullable
/*     */   private final ActionType actionType;
/*     */   
/*     */   private HumanInLoopAction(ActionType actionType) {
/*  87 */     this.actionType = actionType; } @Nullable public final ActionType getActionType() { return this.actionType; } @Nullable
/*     */   public abstract String getAllowListActionName(); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\n\032\0020\003HÆ\003J\023\020\013\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\0038VX\004¢\006\006\032\004\b\t\020\007¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$TerminalAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "allowListActionName", "getAllowListActionName", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"})
/*     */   public static final class TerminalAction extends HumanInLoopAction { @NotNull
/*  90 */     private final String command; public TerminalAction(@NotNull String command) { super(ActionType.Terminal, null); this.command = command; } @NotNull public final String getCommand() { return this.command; }
/*     */     @NotNull
/*  92 */     public String getAllowListActionName() { return this.command; } @NotNull public final String component1() { return this.command; } @NotNull public final TerminalAction copy(@NotNull String command) { Intrinsics.checkNotNullParameter(command, "command"); return new TerminalAction(command); } @NotNull public String toString() { return "TerminalAction(command=" + this.command + ")"; } public int hashCode() { return this.command.hashCode(); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TerminalAction)) return false;  TerminalAction terminalAction = (TerminalAction)other; return !!Intrinsics.areEqual(this.command, terminalAction.command); } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\r\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\021\032\0020\0052\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\0038VX\004¢\006\006\032\004\b\r\020\t¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$RunTestsAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "testsQuery", "", "testFileUnderAIIgnore", "", "<init>", "(Ljava/lang/String;Z)V", "getTestsQuery", "()Ljava/lang/String;", "getTestFileUnderAIIgnore", "()Z", "allowListActionName", "getAllowListActionName", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "core"}) public static final class RunTestsAction extends HumanInLoopAction { @NotNull private final String testsQuery; private final boolean testFileUnderAIIgnore;
/*  95 */     public RunTestsAction(@NotNull String testsQuery, boolean testFileUnderAIIgnore) { super(ActionType.RunTests, null); this.testsQuery = testsQuery; this.testFileUnderAIIgnore = testFileUnderAIIgnore; } @NotNull public final String getTestsQuery() { return this.testsQuery; } public final boolean getTestFileUnderAIIgnore() { return this.testFileUnderAIIgnore; }
/*     */     @NotNull public final String component1() { return this.testsQuery; }
/*  97 */     public final boolean component2() { return this.testFileUnderAIIgnore; } @NotNull public final RunTestsAction copy(@NotNull String testsQuery, boolean testFileUnderAIIgnore) { Intrinsics.checkNotNullParameter(testsQuery, "testsQuery"); return new RunTestsAction(testsQuery, testFileUnderAIIgnore); } @NotNull public String getAllowListActionName() { return this.testsQuery; } @NotNull public String toString() { return "RunTestsAction(testsQuery=" + this.testsQuery + ", testFileUnderAIIgnore=" + this.testFileUnderAIIgnore + ")"; } public int hashCode() { result = this.testsQuery.hashCode(); return result * 31 + Boolean.hashCode(this.testFileUnderAIIgnore); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof RunTestsAction)) return false;  RunTestsAction runTestsAction = (RunTestsAction)other; return !Intrinsics.areEqual(this.testsQuery, runTestsAction.testsQuery) ? false : (!(this.testFileUnderAIIgnore != runTestsAction.testFileUnderAIIgnore)); } }
/*     */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\b\032\0020\t2\b\020\n\032\004\030\0010\013HÖ\003J\t\020\f\032\0020\rHÖ\001J\t\020\016\032\0020\005HÖ\001R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$BuildAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "<init>", "()V", "allowListActionName", "", "getAllowListActionName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "toString", "core"}) public static final class BuildAction extends HumanInLoopAction {
/*  99 */     private BuildAction() { super(ActionType.Build, null); } @NotNull
/*     */     public static final BuildAction INSTANCE = new BuildAction(); @NotNull
/* 101 */     public String getAllowListActionName() { return "build"; } @NotNull public String toString() { return "BuildAction"; } public int hashCode() { return -1425675042; }
/*     */     public boolean equals(@Nullable Object other) { if (this == other)
/*     */         return true;  if (!(other instanceof BuildAction))
/*     */         return false;  (BuildAction)other;
/*     */       return true; } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\026\020\f\032\004\030\0010\0058VX\004¢\006\006\032\004\b\r\020\013¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "path", "Ljava/nio/file/Path;", "presentableActionText", "", "<init>", "(Ljava/nio/file/Path;Ljava/lang/String;)V", "getPath", "()Ljava/nio/file/Path;", "getPresentableActionText", "()Ljava/lang/String;", "allowListActionName", "getAllowListActionName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}) public static final class ActionTouchingFile extends HumanInLoopAction { @NotNull private final Path path; @NotNull private final String presentableActionText;
/* 107 */     public ActionTouchingFile(@NotNull Path path, @NotNull String presentableActionText) { super(null, null); this.path = path; this.presentableActionText = presentableActionText; } @NotNull public final Path getPath() { return this.path; } @NotNull public final String getPresentableActionText() { return this.presentableActionText; } @Nullable
/*     */     public String getAllowListActionName() {
/* 109 */       return null;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Path component1() {
/*     */       return this.path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.presentableActionText;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ActionTouchingFile copy(@NotNull Path path, @NotNull String presentableActionText) {
/*     */       Intrinsics.checkNotNullParameter(path, "path");
/*     */       Intrinsics.checkNotNullParameter(presentableActionText, "presentableActionText");
/*     */       return new ActionTouchingFile(path, presentableActionText);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "ActionTouchingFile(path=" + this.path + ", presentableActionText=" + this.presentableActionText + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.path.hashCode();
/*     */       return result * 31 + this.presentableActionText.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof ActionTouchingFile))
/*     */         return false; 
/*     */       ActionTouchingFile actionTouchingFile = (ActionTouchingFile)other;
/*     */       return !Intrinsics.areEqual(this.path, actionTouchingFile.path) ? false : (!!Intrinsics.areEqual(this.presentableActionText, actionTouchingFile.presentableActionText));
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\HumanInLoopAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */