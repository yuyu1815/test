/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.HighlightingInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextWithHighlightings;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.StyleRange;
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import com.jediterm.terminal.emulator.JediEmulator;
/*     */ import com.jediterm.terminal.model.JediTerminal;
/*     */ import com.jediterm.terminal.model.LinesBuffer;
/*     */ import com.jediterm.terminal.model.StyleState;
/*     */ import com.jediterm.terminal.model.TerminalLine;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\b\000\030\000 &2\0020\001:\003$%&B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\004\b\t\020\nJ\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026J\020\020\020\032\0020\0212\006\020\022\032\0020\023H\002J \020\024\032\b\022\004\022\0020\0260\025*\b\022\004\022\0020\0270\0252\006\020\030\032\0020\031H\002J\034\020\032\032\0020\033*\0020\0342\006\020\035\032\0020\0312\006\020\036\032\0020\031H\002J\034\020\037\032\0020 *\0020 2\006\020!\032\0020\0312\006\020\"\032\0020\031H\002J\f\020#\032\0020 *\0020 H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\002\n\000R\016\020\013\032\0020\001X\004¢\006\002\n\000¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderer;", "colorPalette", "Lcom/intellij/terminal/TerminalColorPalette;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "terminalSizeProvider", "Lkotlin/Function0;", "Lcom/jediterm/core/util/TermSize;", "<init>", "(Lcom/intellij/terminal/TerminalColorPalette;Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;Lkotlin/jvm/functions/Function0;)V", "fallbackRenderer", "calculateRenderingInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "expandPrompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer$ExpandedPromptInfo;", "escapedPrompt", "", "toHighlightings", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyleRange;", "totalTextLength", "", "cursorToLogicalPosition", "Lcom/intellij/openapi/editor/LogicalPosition;", "Lcom/jediterm/terminal/model/LinesBuffer;", "cursorX", "cursorY", "subtext", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "startOffset", "endOffset", "trimStart", "ExpandedPromptInfo", "FakeDisplay", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nShellPromptRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellPromptRenderer.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,226:1\n1#2:227\n1797#3,3:228\n360#3,7:231\n360#3,7:238\n756#3,10:245\n14#4:255\n*S KotlinDebug\n*F\n+ 1 ShellPromptRenderer.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer\n*L\n50#1:228,3\n137#1:231,7\n138#1:238,7\n161#1:245,10\n223#1:255\n*E\n"})
/*     */ public final class ShellPromptRenderer implements TerminalPromptRenderer {
/*     */   public ShellPromptRenderer(@NotNull TerminalColorPalette colorPalette, @NotNull JBTerminalSystemSettingsProviderBase settings, @NotNull Function0<TermSize> terminalSizeProvider) {
/*  23 */     this.colorPalette = colorPalette;
/*  24 */     this.settings = settings;
/*  25 */     this.terminalSizeProvider = terminalSizeProvider;
/*     */     
/*  27 */     this.fallbackRenderer = new BuiltInPromptRenderer(this.colorPalette, false);
/*     */   }
/*     */   @NotNull
/*  30 */   public TerminalPromptRenderingInfo calculateRenderingInfo(@NotNull TerminalPromptState state) { Intrinsics.checkNotNullParameter(state, "state"); String escapedPrompt = state.getOriginalPrompt();
/*  31 */     String escapedRightPrompt = state.getOriginalRightPrompt();
/*  32 */     if (escapedPrompt == null) {
/*  33 */       LOG.warn("Original prompt is null, falling back to built-in prompt. Prompt state: " + state);
/*  34 */       return this.fallbackRenderer.calculateRenderingInfo(state);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  43 */     ExpandedPromptInfo promptInfo = expandPrompt(escapedPrompt);
/*  44 */     String[] arrayOfString = new String[1]; arrayOfString[0] = "\n"; List<String> lines = StringsKt.split$default(promptInfo.getContent().getText(), arrayOfString, false, 0, 6, null);
/*  45 */     boolean bool = (lines.size() == promptInfo.getCursorY() + 1) ? true : false; if (_Assertions.ENABLED && !bool)
/*     */     
/*     */     { 
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
/* 227 */       int $i$a$-assert-ShellPromptRenderer$calculateRenderingInfo$1 = 0; String str = "Cursor is not at the last prompt line. Expanded prompt: " + promptInfo + ", prompt state: " + state; throw new AssertionError(str); }  bool = (((String)lines.get(promptInfo.getCursorY())).length() >= promptInfo.getCursorX()) ? true : false; if (_Assertions.ENABLED && !bool) { int $i$a$-assert-ShellPromptRenderer$calculateRenderingInfo$2 = 0; String str = "Cursor X position is out of prompt line length. Expanded prompt: " + promptInfo + ", prompt state: " + state; throw new AssertionError(str); }
/* 228 */      Intrinsics.checkNotNullExpressionValue(((String)lines.get(promptInfo.getCursorY())).substring(promptInfo.getCursorX()), "substring(...)"); String rightText = ((String)lines.get(promptInfo.getCursorY())).substring(promptInfo.getCursorX()); List<String> fullLines = lines.subList(0, lines.size() - 1); List<String> list1 = fullLines; int initial$iv = 0, $i$f$fold = 0; int accumulator$iv = initial$iv;
/* 229 */     for (String element$iv : list1) { String str1 = element$iv; int acc = accumulator$iv, $i$a$-fold-ShellPromptRenderer$calculateRenderingInfo$cursorOffset$1 = 0; accumulator$iv = acc + str1.length(); }
/* 230 */      int cursorOffset = accumulator$iv + fullLines.size() + promptInfo.getCursorX(); TextWithHighlightings leftPart = subtext(promptInfo.getContent(), 0, cursorOffset); TextWithHighlightings rightPart = trimStart(subtext(promptInfo.getContent(), cursorOffset, promptInfo.getContent().getText().length())); Pair pair = (escapedRightPrompt != null) ? TuplesKt.to(expandPrompt(escapedPrompt).getContent(), expandPrompt(escapedRightPrompt).getContent()) : ((!StringsKt.isBlank(rightText)) ? TuplesKt.to(leftPart, rightPart) : TuplesKt.to(promptInfo.getContent(), new TextWithHighlightings("", CollectionsKt.emptyList()))); TextWithHighlightings prompt = (TextWithHighlightings)pair.component1(), rightPrompt = (TextWithHighlightings)pair.component2(); return new TerminalPromptRenderingInfo(prompt.getText(), prompt.getHighlightings(), rightPrompt.getText(), rightPrompt.getHighlightings()); } private final ExpandedPromptInfo expandPrompt(String escapedPrompt) { StyleState styleState = new StyleState(); TextStyle defaultStyle = new TextStyle(new TerminalColor(this::expandPrompt$lambda$3), new TerminalColor(this::expandPrompt$lambda$4)); styleState.setDefaultStyle(defaultStyle); TermSize terminalSize = (TermSize)this.terminalSizeProvider.invoke(); TerminalTextBuffer textBuffer = TerminalBuffer_VersionDependent.INSTANCE.createTerminalBuffer(terminalSize.getColumns(), terminalSize.getRows(), styleState, 0); JediTerminal terminal = new JediTerminal(new FakeDisplay(this.settings), textBuffer, styleState); terminal.setModeEnabled(TerminalMode.AutoNewLine, true); Intrinsics.checkNotNullExpressionValue(escapedPrompt.toCharArray(), "toCharArray(...)"); ArrayTerminalDataStream dataStream = new ArrayTerminalDataStream(escapedPrompt.toCharArray()); JediEmulator emulator = new JediEmulator((TerminalDataStream)dataStream, (Terminal)terminal); while (emulator.hasNext())
/*     */       emulator.next();  StyledCommandOutput output = ShellCommandOutputScraperImpl.Companion.scrapeOutput$default(ShellCommandOutputScraperImpl.Companion, textBuffer, null, 0, 6, null); List<HighlightingInfo> highlightings = toHighlightings(output.getStyleRanges(), output.getText().length()); LogicalPosition logicalPosition = cursorToLogicalPosition(textBuffer.getScreenBuffer(), terminal.getCursorX() - 1, terminal.getCursorY() - 1); return new ExpandedPromptInfo(new TextWithHighlightings(output.getText(), highlightings), logicalPosition.column, logicalPosition.line); }
/*     */   private static final Color expandPrompt$lambda$3(ShellPromptRenderer this$0) { return this$0.colorPalette.getDefaultForeground(); }
/*     */   private static final Color expandPrompt$lambda$4(ShellPromptRenderer this$0) { return this$0.colorPalette.getDefaultBackground(); }
/*     */   private final List<HighlightingInfo> toHighlightings(List $this$toHighlightings, int totalTextLength) { List<HighlightingInfo> highlightings = new ArrayList(); int curOffset = 0; for (StyleRange range : $this$toHighlightings) { if (curOffset < range.getStartOffset())
/*     */         highlightings.add(new HighlightingInfo(curOffset, range.getStartOffset(), (TextAttributesProvider)EmptyTextAttributesProvider.INSTANCE));  highlightings.add(new HighlightingInfo(range.getStartOffset(), range.getEndOffset(), (TextAttributesProvider)new TextStyleAdapter(range.getStyle(), this.colorPalette))); curOffset = range.getEndOffset(); }  if (curOffset < totalTextLength)
/*     */       highlightings.add(new HighlightingInfo(curOffset, totalTextLength, (TextAttributesProvider)EmptyTextAttributesProvider.INSTANCE));  return highlightings; }
/*     */   private final LogicalPosition cursorToLogicalPosition(LinesBuffer $this$cursorToLogicalPosition, int cursorX, int cursorY) { boolean bool = (cursorX >= 0 && cursorY >= 0) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }  int logicalLine = 0; for (int curY = 0; curY < cursorY; curY++) { if (!$this$cursorToLogicalPosition.getLine(curY).isWrapped())
/*     */         logicalLine++;  }
/*     */      List<TerminalLine> wrappedLines = new ArrayList(); int i = cursorY - 1; while (i >= 0 && $this$cursorToLogicalPosition.getLine(i).isWrapped()) { Intrinsics.checkNotNullExpressionValue($this$cursorToLogicalPosition.getLine(i), "getLine(...)"); wrappedLines.add($this$cursorToLogicalPosition.getLine(i)); i--; }
/*     */      List<TerminalLine> list1 = wrappedLines; int j = 0; for (TerminalLine terminalLine1 : list1) { TerminalLine terminalLine2 = terminalLine1; int m = j, $i$a$-sumOfInt-ShellPromptRenderer$cursorToLogicalPosition$wrappedLinesLength$1 = 0; Intrinsics.checkNotNullExpressionValue(terminalLine2.getEntries(), "getEntries(...)"); List list = terminalLine2.getEntries(); int k = 0; for (TerminalLine.TextEntry textEntry1 : list) { TerminalLine.TextEntry textEntry2 = textEntry1; int i1 = k, $i$a$-sumOfInt-ShellPromptRenderer$cursorToLogicalPosition$wrappedLinesLength$1$1 = 0; Intrinsics.checkNotNullExpressionValue(textEntry2.getText(), "getText(...)"); int i2 = TerminalUiUtilsKt.normalize(textEntry2.getText()).length(); k = i1 + i2; }
/*     */        int n = k; j = m + n; }
/*     */      int wrappedLinesLength = j; int logicalColumn = wrappedLinesLength + cursorX; return new LogicalPosition(logicalLine, logicalColumn); }
/*     */   private final TextWithHighlightings subtext(TextWithHighlightings $this$subtext, int startOffset, int endOffset) { // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: iload_2
/*     */     //   2: if_icmpgt -> 18
/*     */     //   5: iload_2
/*     */     //   6: iload_3
/*     */     //   7: if_icmpgt -> 14
/*     */     //   10: iconst_1
/*     */     //   11: goto -> 19
/*     */     //   14: iconst_0
/*     */     //   15: goto -> 19
/*     */     //   18: iconst_0
/*     */     //   19: ifeq -> 37
/*     */     //   22: iload_3
/*     */     //   23: aload_1
/*     */     //   24: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   27: invokevirtual length : ()I
/*     */     //   30: if_icmpgt -> 37
/*     */     //   33: iconst_1
/*     */     //   34: goto -> 38
/*     */     //   37: iconst_0
/*     */     //   38: istore #4
/*     */     //   40: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   43: ifeq -> 66
/*     */     //   46: iload #4
/*     */     //   48: ifne -> 66
/*     */     //   51: ldc_w 'Assertion failed'
/*     */     //   54: astore #5
/*     */     //   56: new java/lang/AssertionError
/*     */     //   59: dup
/*     */     //   60: aload #5
/*     */     //   62: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   65: athrow
/*     */     //   66: iload_2
/*     */     //   67: iload_3
/*     */     //   68: if_icmpne -> 84
/*     */     //   71: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings
/*     */     //   74: dup
/*     */     //   75: ldc ''
/*     */     //   77: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   80: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
/*     */     //   83: areturn
/*     */     //   84: aload_1
/*     */     //   85: invokevirtual getHighlightings : ()Ljava/util/List;
/*     */     //   88: astore #5
/*     */     //   90: iconst_0
/*     */     //   91: istore #6
/*     */     //   93: iconst_0
/*     */     //   94: istore #7
/*     */     //   96: aload #5
/*     */     //   98: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   103: astore #8
/*     */     //   105: aload #8
/*     */     //   107: invokeinterface hasNext : ()Z
/*     */     //   112: ifeq -> 179
/*     */     //   115: aload #8
/*     */     //   117: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   122: astore #9
/*     */     //   124: aload #9
/*     */     //   126: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   129: astore #10
/*     */     //   131: iconst_0
/*     */     //   132: istore #11
/*     */     //   134: aload #10
/*     */     //   136: invokevirtual getStartOffset : ()I
/*     */     //   139: istore #12
/*     */     //   141: iload_2
/*     */     //   142: aload #10
/*     */     //   144: invokevirtual getEndOffset : ()I
/*     */     //   147: if_icmpge -> 164
/*     */     //   150: iload #12
/*     */     //   152: iload_2
/*     */     //   153: if_icmpgt -> 160
/*     */     //   156: iconst_1
/*     */     //   157: goto -> 165
/*     */     //   160: iconst_0
/*     */     //   161: goto -> 165
/*     */     //   164: iconst_0
/*     */     //   165: ifeq -> 173
/*     */     //   168: iload #7
/*     */     //   170: goto -> 180
/*     */     //   173: iinc #7, 1
/*     */     //   176: goto -> 105
/*     */     //   179: iconst_m1
/*     */     //   180: istore #4
/*     */     //   182: aload_1
/*     */     //   183: invokevirtual getHighlightings : ()Ljava/util/List;
/*     */     //   186: astore #6
/*     */     //   188: iconst_0
/*     */     //   189: istore #7
/*     */     //   191: iconst_0
/*     */     //   192: istore #8
/*     */     //   194: aload #6
/*     */     //   196: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   201: astore #9
/*     */     //   203: aload #9
/*     */     //   205: invokeinterface hasNext : ()Z
/*     */     //   210: ifeq -> 288
/*     */     //   213: aload #9
/*     */     //   215: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   220: astore #10
/*     */     //   222: aload #10
/*     */     //   224: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   227: astore #11
/*     */     //   229: iconst_0
/*     */     //   230: istore #12
/*     */     //   232: aload #11
/*     */     //   234: invokevirtual getStartOffset : ()I
/*     */     //   237: istore #13
/*     */     //   239: aload #11
/*     */     //   241: invokevirtual getEndOffset : ()I
/*     */     //   244: istore #14
/*     */     //   246: iload_3
/*     */     //   247: iconst_1
/*     */     //   248: isub
/*     */     //   249: istore #15
/*     */     //   251: iload #13
/*     */     //   253: iload #15
/*     */     //   255: if_icmpgt -> 273
/*     */     //   258: iload #15
/*     */     //   260: iload #14
/*     */     //   262: if_icmpge -> 269
/*     */     //   265: iconst_1
/*     */     //   266: goto -> 274
/*     */     //   269: iconst_0
/*     */     //   270: goto -> 274
/*     */     //   273: iconst_0
/*     */     //   274: ifeq -> 282
/*     */     //   277: iload #8
/*     */     //   279: goto -> 289
/*     */     //   282: iinc #8, 1
/*     */     //   285: goto -> 203
/*     */     //   288: iconst_m1
/*     */     //   289: istore #5
/*     */     //   291: iload #4
/*     */     //   293: iflt -> 305
/*     */     //   296: iload #5
/*     */     //   298: iflt -> 305
/*     */     //   301: iconst_1
/*     */     //   302: goto -> 306
/*     */     //   305: iconst_0
/*     */     //   306: istore #6
/*     */     //   308: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   311: ifeq -> 334
/*     */     //   314: iload #6
/*     */     //   316: ifne -> 334
/*     */     //   319: ldc_w 'Assertion failed'
/*     */     //   322: astore #7
/*     */     //   324: new java/lang/AssertionError
/*     */     //   327: dup
/*     */     //   328: aload #7
/*     */     //   330: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   333: athrow
/*     */     //   334: aload_1
/*     */     //   335: invokevirtual getHighlightings : ()Ljava/util/List;
/*     */     //   338: iload #4
/*     */     //   340: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   345: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   348: astore #6
/*     */     //   350: aload_1
/*     */     //   351: invokevirtual getHighlightings : ()Ljava/util/List;
/*     */     //   354: iload #5
/*     */     //   356: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   361: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   364: astore #7
/*     */     //   366: iload #4
/*     */     //   368: iload #5
/*     */     //   370: if_icmpeq -> 472
/*     */     //   373: invokestatic createListBuilder : ()Ljava/util/List;
/*     */     //   376: astore #9
/*     */     //   378: aload #9
/*     */     //   380: astore #10
/*     */     //   382: iconst_0
/*     */     //   383: istore #11
/*     */     //   385: aload #10
/*     */     //   387: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   390: dup
/*     */     //   391: iload_2
/*     */     //   392: aload #6
/*     */     //   394: invokevirtual getEndOffset : ()I
/*     */     //   397: aload #6
/*     */     //   399: invokevirtual getTextAttributesProvider : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */     //   402: invokespecial <init> : (IILcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   405: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   410: pop
/*     */     //   411: aload #10
/*     */     //   413: aload_1
/*     */     //   414: invokevirtual getHighlightings : ()Ljava/util/List;
/*     */     //   417: iload #4
/*     */     //   419: iconst_1
/*     */     //   420: iadd
/*     */     //   421: iload #5
/*     */     //   423: invokeinterface subList : (II)Ljava/util/List;
/*     */     //   428: checkcast java/util/Collection
/*     */     //   431: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   436: pop
/*     */     //   437: aload #10
/*     */     //   439: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   442: dup
/*     */     //   443: aload #7
/*     */     //   445: invokevirtual getStartOffset : ()I
/*     */     //   448: iload_3
/*     */     //   449: aload #7
/*     */     //   451: invokevirtual getTextAttributesProvider : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */     //   454: invokespecial <init> : (IILcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   457: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   462: pop
/*     */     //   463: nop
/*     */     //   464: aload #9
/*     */     //   466: invokestatic build : (Ljava/util/List;)Ljava/util/List;
/*     */     //   469: goto -> 489
/*     */     //   472: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   475: dup
/*     */     //   476: iload_2
/*     */     //   477: iload_3
/*     */     //   478: aload #6
/*     */     //   480: invokevirtual getTextAttributesProvider : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */     //   483: invokespecial <init> : (IILcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */     //   486: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   489: astore #8
/*     */     //   491: aload #8
/*     */     //   493: aload #8
/*     */     //   495: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   498: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */     //   501: invokevirtual getStartOffset : ()I
/*     */     //   504: ineg
/*     */     //   505: invokestatic rebase : (Ljava/util/List;I)Ljava/util/List;
/*     */     //   508: astore #9
/*     */     //   510: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings
/*     */     //   513: dup
/*     */     //   514: aload_1
/*     */     //   515: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   518: iload_2
/*     */     //   519: iload_3
/*     */     //   520: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   523: dup
/*     */     //   524: ldc 'substring(...)'
/*     */     //   526: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   529: aload #9
/*     */     //   531: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
/*     */     //   534: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #133	-> 0
/*     */     //   #134	-> 66
/*     */     //   #135	-> 71
/*     */     //   #137	-> 84
/*     */     //   #231	-> 93
/*     */     //   #232	-> 96
/*     */     //   #233	-> 124
/*     */     //   #137	-> 134
/*     */     //   #233	-> 165
/*     */     //   #234	-> 168
/*     */     //   #235	-> 173
/*     */     //   #237	-> 179
/*     */     //   #137	-> 180
/*     */     //   #138	-> 182
/*     */     //   #238	-> 191
/*     */     //   #239	-> 194
/*     */     //   #240	-> 222
/*     */     //   #138	-> 232
/*     */     //   #240	-> 274
/*     */     //   #241	-> 277
/*     */     //   #242	-> 282
/*     */     //   #244	-> 288
/*     */     //   #138	-> 289
/*     */     //   #139	-> 291
/*     */     //   #140	-> 334
/*     */     //   #141	-> 350
/*     */     //   #142	-> 366
/*     */     //   #143	-> 373
/*     */     //   #144	-> 385
/*     */     //   #145	-> 411
/*     */     //   #146	-> 437
/*     */     //   #147	-> 463
/*     */     //   #143	-> 464
/*     */     //   #149	-> 472
/*     */     //   #142	-> 489
/*     */     //   #151	-> 491
/*     */     //   #152	-> 510
/*     */     //   #152	-> 529
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   134	31	11	$i$a$-indexOfFirst-ShellPromptRenderer$subtext$startHighlightingIndex$1	I
/*     */     //   131	34	10	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;
/*     */     //   124	52	9	item$iv	Ljava/lang/Object;
/*     */     //   93	87	6	$i$f$indexOfFirst	I
/*     */     //   96	84	7	index$iv	I
/*     */     //   90	90	5	$this$indexOfFirst$iv	Ljava/util/List;
/*     */     //   232	42	12	$i$a$-indexOfFirst-ShellPromptRenderer$subtext$endHighlightingIndex$1	I
/*     */     //   229	45	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;
/*     */     //   222	63	10	item$iv	Ljava/lang/Object;
/*     */     //   191	98	7	$i$f$indexOfFirst	I
/*     */     //   194	95	8	index$iv	I
/*     */     //   188	101	6	$this$indexOfFirst$iv	Ljava/util/List;
/*     */     //   385	79	11	$i$a$-buildList-ShellPromptRenderer$subtext$newHighlightings$1	I
/*     */     //   382	82	10	$this$subtext_u24lambda_u249	Ljava/util/List;
/*     */     //   182	353	4	startHighlightingIndex	I
/*     */     //   291	244	5	endHighlightingIndex	I
/*     */     //   350	185	6	startHighlighting	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;
/*     */     //   366	169	7	endHighlighting	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;
/*     */     //   491	44	8	newHighlightings	Ljava/util/List;
/*     */     //   510	25	9	adjustedHighlightings	Ljava/util/List;
/*     */     //   0	535	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer;
/*     */     //   0	535	1	$this$subtext	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */     //   0	535	2	startOffset	I
/*     */     //   0	535	3	endOffset	I }
/*     */   private final TextWithHighlightings trimStart(TextWithHighlightings $this$trimStart) { if ((((CharSequence)$this$trimStart.getText()).length() == 0))
/* 245 */       return $this$trimStart;  Iterable $this$dropWhile$iv = $this$trimStart.getHighlightings(); int $i$f$dropWhile = 0; boolean yielding$iv = false;
/* 246 */     ArrayList<Object> list$iv = new ArrayList();
/* 247 */     for (Object item$iv : $this$dropWhile$iv) {
/* 248 */       if (yielding$iv) {
/* 249 */         list$iv.add(item$iv); continue;
/* 250 */       }  HighlightingInfo it = (HighlightingInfo)item$iv; int $i$a$-dropWhile-ShellPromptRenderer$trimStart$newHighlightings$1 = 0; Intrinsics.checkNotNullExpressionValue($this$trimStart.getText().substring(it.getStartOffset(), it.getEndOffset()), "substring(...)"); if (!((StringsKt.isBlank($this$trimStart.getText().substring(it.getStartOffset(), it.getEndOffset())) && it.getTextAttributesProvider() == EmptyTextAttributesProvider.INSTANCE) ? 1 : 0)) {
/* 251 */         list$iv.add(item$iv);
/* 252 */         yielding$iv = true;
/*     */       } 
/* 254 */     }  List<Object> newHighlightings = list$iv; if (newHighlightings.isEmpty()) return new TextWithHighlightings("", CollectionsKt.emptyList());  int startOffset = ((HighlightingInfo)CollectionsKt.first(newHighlightings)).getStartOffset(); List adjustedHighlightings = TerminalTextHighlighterKt.rebase(newHighlightings, -startOffset); Intrinsics.checkNotNullExpressionValue($this$trimStart.getText().substring(startOffset), "substring(...)"); return new TextWithHighlightings($this$trimStart.getText().substring(startOffset), adjustedHighlightings); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\t\020\020\032\0020\005HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\005HÖ\001J\t\020\026\032\0020\027HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer$ExpandedPromptInfo;", "", "content", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "cursorX", "", "cursorY", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;II)V", "getContent", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "getCursorX", "()I", "getCursorY", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"}) private static final class ExpandedPromptInfo {
/* 255 */     @NotNull private final TextWithHighlightings content; private final int cursorX; private final int cursorY; public ExpandedPromptInfo(@NotNull TextWithHighlightings content, int cursorX, int cursorY) { this.content = content; this.cursorX = cursorX; this.cursorY = cursorY; } @NotNull public final TextWithHighlightings getContent() { return this.content; } public final int getCursorX() { return this.cursorX; } public final int getCursorY() { return this.cursorY; } @NotNull public final TextWithHighlightings component1() { return this.content; } public final int component2() { return this.cursorX; } public final int component3() { return this.cursorY; } @NotNull public final ExpandedPromptInfo copy(@NotNull TextWithHighlightings content, int cursorX, int cursorY) { Intrinsics.checkNotNullParameter(content, "content"); return new ExpandedPromptInfo(content, cursorX, cursorY); } @NotNull public String toString() { return "ExpandedPromptInfo(content=" + this.content + ", cursorX=" + this.cursorX + ", cursorY=" + this.cursorY + ")"; } public int hashCode() { result = this.content.hashCode(); result = result * 31 + Integer.hashCode(this.cursorX); return result * 31 + Integer.hashCode(this.cursorY); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ExpandedPromptInfo)) return false;  ExpandedPromptInfo expandedPromptInfo = (ExpandedPromptInfo)other; return !Intrinsics.areEqual(this.content, expandedPromptInfo.content) ? false : ((this.cursorX != expandedPromptInfo.cursorX) ? false : (!(this.cursorY != expandedPromptInfo.cursorY))); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\030\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\tH\026J\022\020\013\032\0020\0072\b\020\f\032\004\030\0010\rH\026J\b\020\016\032\0020\007H\026J \020\017\032\0020\0072\006\020\020\032\0020\t2\006\020\021\032\0020\t2\006\020\022\032\0020\tH\026J\020\020\023\032\0020\0072\006\020\024\032\0020\025H\026J\020\020\026\032\0020\0072\006\020\026\032\0020\025H\026J\b\020\027\032\0020\030H\026J\020\020\031\032\0020\0072\006\020\032\032\0020\030H\026J\n\020\033\032\004\030\0010\034H\026J\020\020\035\032\0020\0072\006\020\036\032\0020\037H\026J\020\020 \032\0020\0072\006\020!\032\0020\"H\026J\b\020#\032\0020\025H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer$FakeDisplay;", "Lcom/jediterm/terminal/TerminalDisplay;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "<init>", "(Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;)V", "setCursor", "", "x", "", "y", "setCursorShape", "cursorShape", "Lcom/jediterm/terminal/CursorShape;", "beep", "scrollArea", "scrollRegionTop", "scrollRegionSize", "dy", "setCursorVisible", "isCursorVisible", "", "useAlternateScreenBuffer", "getWindowTitle", "", "setWindowTitle", "windowTitle", "getSelection", "Lcom/jediterm/terminal/model/TerminalSelection;", "terminalMouseModeSet", "mouseMode", "Lcom/jediterm/terminal/emulator/mouse/MouseMode;", "setMouseFormat", "mouseFormat", "Lcom/jediterm/terminal/emulator/mouse/MouseFormat;", "ambiguousCharsAreDoubleWidth", "ej-core"}) private static final class FakeDisplay implements TerminalDisplay { @NotNull private final JBTerminalSystemSettingsProviderBase settings; public FakeDisplay(@NotNull JBTerminalSystemSettingsProviderBase settings) { this.settings = settings; } public void setCursor(int x, int y) {} public void setCursorShape(@Nullable CursorShape cursorShape) {} public void beep() {} public void scrollArea(int scrollRegionTop, int scrollRegionSize, int dy) {} public void setCursorVisible(boolean isCursorVisible) {} public void useAlternateScreenBuffer(boolean useAlternateScreenBuffer) {} @NotNull public String getWindowTitle() { return ""; } public void setWindowTitle(@NotNull String windowTitle) { Intrinsics.checkNotNullParameter(windowTitle, "windowTitle"); } @Nullable public TerminalSelection getSelection() { return null; } public void terminalMouseModeSet(@NotNull MouseMode mouseMode) { Intrinsics.checkNotNullParameter(mouseMode, "mouseMode"); } public void setMouseFormat(@NotNull MouseFormat mouseFormat) { Intrinsics.checkNotNullParameter(mouseFormat, "mouseFormat"); } public boolean ambiguousCharsAreDoubleWidth() { return this.settings.ambiguousCharsAreDoubleWidth(); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/ShellPromptRenderer$Companion;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"}) public static final class Companion { private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(ShellPromptRenderer.class), "getInstance(...)"); } @NotNull private final TerminalColorPalette colorPalette; @NotNull private final JBTerminalSystemSettingsProviderBase settings; @NotNull private final Function0<TermSize> terminalSizeProvider; @NotNull private final TerminalPromptRenderer fallbackRenderer; @NotNull private static final Logger LOG = Logger.getInstance(ShellPromptRenderer.class);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\ShellPromptRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */