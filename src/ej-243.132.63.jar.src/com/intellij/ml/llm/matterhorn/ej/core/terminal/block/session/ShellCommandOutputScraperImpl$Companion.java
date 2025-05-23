/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper.CommandEndMarkerListeningStringCollector;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper.DropTrailingNewLinesStringCollector;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper.SimpleStringCollector;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper.StringCollector;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper.StylesCollectingTerminalLinesCollector;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper.TerminalLinesCollector;
/*    */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.AdaptedFunctionReference;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J$\020\004\032\0020\0052\006\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\0132\b\b\002\020\f\032\0020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl$Companion;", "", "<init>", "()V", "scrapeOutput", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "textBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "commandEndMarker", "", "startLine", "", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final StyledCommandOutput scrapeOutput(@NotNull BlockTerminalSession session) {
/* 68 */     Intrinsics.checkNotNullParameter(session, "session"); return scrapeOutput$default(this, session.getModel().getTextBuffer$ej_core(), session.getCommandBlockIntegration().getCommandEndMarker(), 0, 4, null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final StyledCommandOutput scrapeOutput(@NotNull TerminalTextBuffer textBuffer, @Nullable String commandEndMarker, int startLine) {
/* 81 */     Intrinsics.checkNotNullParameter(textBuffer, "textBuffer"); Ref.BooleanRef commandEndMarkerFound = new Ref.BooleanRef();
/* 82 */     StringCollector stringCollector = (StringCollector)new CommandEndMarkerListeningStringCollector(
/* 83 */         (StringCollector)new DropTrailingNewLinesStringCollector((StringCollector)new SimpleStringCollector()), 
/* 84 */         commandEndMarker, commandEndMarkerFound::scrapeOutput$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 89 */     List<StyleRange> styles = new ArrayList();
/* 90 */     TerminalLinesCollector styleCollectingOutputBuilder = (TerminalLinesCollector)new StylesCollectingTerminalLinesCollector(stringCollector, new ShellCommandOutputScraperImpl$Companion$scrapeOutput$styleCollectingOutputBuilder$1(styles));
/* 91 */     TerminalLinesCollector terminalLinesCollector = styleCollectingOutputBuilder;
/* 92 */     ShellCommandOutputScraperImplKt.collectLines(textBuffer, terminalLinesCollector, startLine);
/* 93 */     return new StyledCommandOutput(stringCollector.buildText(), commandEndMarkerFound.element, styles);
/*    */   }
/*    */   
/*    */   private static final Unit scrapeOutput$lambda$0(Ref.BooleanRef $commandEndMarkerFound) {
/*    */     $commandEndMarkerFound.element = true;
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandOutputScraperImpl$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */