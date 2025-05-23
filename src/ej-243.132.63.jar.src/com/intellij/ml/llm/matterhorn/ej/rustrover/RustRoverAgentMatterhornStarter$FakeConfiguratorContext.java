/*     */ package com.intellij.ml.llm.matterhorn.ej.rustrover;
/*     */ 
/*     */ import com.intellij.ide.CommandLineInspectionProgressReporter;
/*     */ import com.intellij.ide.CommandLineInspectionProjectConfigurator;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import java.nio.file.Path;
/*     */ import java.util.function.Predicate;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\b\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026J\016\020\n\032\b\022\004\022\0020\t0\013H\026¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$FakeConfiguratorContext;", "Lcom/intellij/ide/CommandLineInspectionProjectConfigurator$ConfiguratorContext;", "<init>", "()V", "getLogger", "Lcom/intellij/ide/CommandLineInspectionProgressReporter;", "getProgressIndicator", "Lcom/intellij/openapi/progress/ProgressIndicator;", "getProjectPath", "Ljava/nio/file/Path;", "getFilesFilter", "Ljava/util/function/Predicate;", "ej-rustrover"})
/*     */ final class FakeConfiguratorContext
/*     */   implements CommandLineInspectionProjectConfigurator.ConfiguratorContext
/*     */ {
/*     */   @NotNull
/*     */   public CommandLineInspectionProgressReporter getLogger() {
/* 141 */     return new RustRoverAgentMatterhornStarter$FakeConfiguratorContext$getLogger$1(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\030\020\006\032\0020\0032\006\020\007\032\0020\b2\006\020\004\032\0020\005H\026¨\006\t"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/rustrover/RustRoverAgentMatterhornStarter$FakeConfiguratorContext$getLogger$1", "Lcom/intellij/ide/CommandLineInspectionProgressReporter;", "reportError", "", "message", "", "reportMessage", "minVerboseLevel", "", "ej-rustrover"})
/* 142 */   public static final class RustRoverAgentMatterhornStarter$FakeConfiguratorContext$getLogger$1 implements CommandLineInspectionProgressReporter { public void reportError(String message) { Intrinsics.checkNotNullParameter(message, "message"); } public void reportMessage(int minVerboseLevel, String message) {
/* 143 */       Intrinsics.checkNotNullParameter(message, "message");
/*     */     } }
/*     */    @NotNull
/* 146 */   public ProgressIndicator getProgressIndicator() { throw new UnsupportedOperationException(); } @NotNull
/* 147 */   public Path getProjectPath() { throw new UnsupportedOperationException(); } @NotNull
/* 148 */   public Predicate<Path> getFilesFilter() { throw new UnsupportedOperationException(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\RustRoverAgentMatterhornStarter$FakeConfiguratorContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */