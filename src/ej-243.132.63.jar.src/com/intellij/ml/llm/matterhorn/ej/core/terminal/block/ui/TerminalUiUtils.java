/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*     */ import com.intellij.execution.filters.HyperlinkInfo;
/*     */ import com.intellij.execution.filters.HyperlinkWithPopupMenuInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextAttributesProvider;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TextStyleAdapter;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.ActionGroup;
/*     */ import com.intellij.openapi.actionSystem.ActionManager;
/*     */ import com.intellij.openapi.actionSystem.CustomShortcutSet;
/*     */ import com.intellij.openapi.actionSystem.DefaultActionGroup;
/*     */ import com.intellij.openapi.actionSystem.Separator;
/*     */ import com.intellij.openapi.actionSystem.ShortcutSet;
/*     */ import com.intellij.openapi.application.ActionsKt;
/*     */ import com.intellij.openapi.application.ModalityState;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.EditorFactory;
/*     */ import com.intellij.openapi.editor.EditorKind;
/*     */ import com.intellij.openapi.editor.EditorSettings;
/*     */ import com.intellij.openapi.editor.colors.EditorColorsScheme;
/*     */ import com.intellij.openapi.editor.event.EditorMouseEvent;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.impl.EditorImpl;
/*     */ import com.intellij.openapi.editor.markup.EffectType;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.terminal.JBTerminalSystemSettingsProviderBase;
/*     */ import com.intellij.terminal.TerminalColorPalette;
/*     */ import com.intellij.util.Alarm;
/*     */ import com.intellij.util.concurrency.ThreadingAssertions;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import com.jediterm.core.Color;
/*     */ import com.jediterm.core.util.TermSize;
/*     */ import com.jediterm.terminal.TerminalColor;
/*     */ import com.jediterm.terminal.TextStyle;
/*     */ import com.jediterm.terminal.ui.AwtTransformers;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.event.ComponentAdapter;
/*     */ import java.awt.event.ComponentEvent;
/*     */ import java.awt.geom.Dimension2D;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CompletableFuture;
/*     */ import javax.swing.KeyStroke;
/*     */ import javax.swing.border.Border;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000´\001\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\t\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\002J\030\020\020\032\0020\0212\006\020\016\032\0020\0172\006\020\022\032\0020\023H\002J%\020\024\032\0020\0212\026\020\025\032\f\022\b\b\001\022\004\030\0010\0210\026\"\004\030\0010\021H\002¢\006\002\020\027J\026\020\030\032\0020\0312\006\020\032\032\0020\0332\006\020\034\032\0020\033J\026\020\035\032\0020\0362\006\020\037\032\0020 2\006\020!\032\0020\"J\020\020#\032\0020\0362\006\020$\032\0020\036H\002J\024\020%\032\006\022\002\b\0030&2\006\020'\032\0020(H\007J\"\020)\032\0020\r2\n\020*\032\006\022\002\b\0030&2\006\020+\032\0020,2\006\020-\032\0020.J\016\020/\032\002002\006\0201\032\0020\033J\031\0202\032\00203*\002042\006\0205\032\00206H\000¢\006\002\b7J\022\0208\032\00209*\002062\006\020:\032\0020\033J\030\020;\032\002092\006\020<\032\002042\006\0205\032\00206H\002J\030\020=\032\002092\006\020<\032\002042\006\0205\032\00206H\002J\030\020>\032\002092\006\020<\032\002042\006\0205\032\00206H\002J\032\020?\032\004\030\001092\006\020<\032\002042\006\0205\032\00206H\002J\030\020@\032\002092\006\020<\032\002042\006\0205\032\00206H\002J\030\020A\032\002092\006\020<\032\002042\006\0205\032\00206H\002J\026\020B\032\0020C2\006\020D\032\0020\0332\006\0205\032\00206R\016\020E\032\0020FXT¢\006\002\n\000R\016\020G\032\0020\033XT¢\006\002\n\000R\016\020H\032\0020\033XT¢\006\002\n\000¨\006I"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils;", "", "<init>", "()V", "createOutputEditor", "Lcom/intellij/openapi/editor/impl/EditorImpl;", "document", "Lcom/intellij/openapi/editor/Document;", "project", "Lcom/intellij/openapi/project/Project;", "settings", "Lcom/intellij/terminal/JBTerminalSystemSettingsProviderBase;", "installPopupMenu", "", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "getPopupMenuGroup", "Lcom/intellij/openapi/actionSystem/ActionGroup;", "event", "Lcom/intellij/openapi/editor/event/EditorMouseEvent;", "concatGroups", "groups", "", "([Lcom/intellij/openapi/actionSystem/ActionGroup;)Lcom/intellij/openapi/actionSystem/ActionGroup;", "createSingleShortcutSet", "Lcom/intellij/openapi/actionSystem/ShortcutSet;", "keyCode", "", "modifiers", "calculateTerminalSize", "Lcom/jediterm/core/util/TermSize;", "componentSize", "Ljava/awt/Dimension;", "charSize", "Ljava/awt/geom/Dimension2D;", "ensureTermMinimumSize", "size", "getComponentSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "component", "Ljava/awt/Component;", "cancelFutureByTimeout", "future", "timeoutMillis", "", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "toFloatAndScale", "", "value", "toTextAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "Lcom/jediterm/terminal/TextStyle;", "palette", "Lcom/intellij/terminal/TerminalColorPalette;", "toTextAttributes$ej_core", "getAwtForegroundByIndex", "Ljava/awt/Color;", "colorIndex", "getResultForeground", "style", "getEffectiveForegroundOrDefault", "getEffectiveBackgroundOrDefault", "getEffectiveBackgroundNoDefault", "toForeground", "toBackground", "plainAttributesProvider", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "foregroundColorIndex", "TERMINAL_OUTPUT_CONTEXT_MENU", "", "GREEN_COLOR_INDEX", "YELLOW_COLOR_INDEX", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils\n+ 2 KtUtils.kt\ncom/intellij/util/KotlinUtils\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n19#2:324\n11483#3,9:325\n13409#3:334\n13410#3:337\n11492#3:338\n18#4:335\n1#5:336\n1#5:339\n*S KotlinDebug\n*F\n+ 1 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils\n*L\n110#1:324\n116#1:325,9\n116#1:334\n116#1:337\n116#1:338\n117#1:335\n116#1:336\n*E\n"})
/*     */ public final class TerminalUiUtils {
/*     */   @NotNull
/*     */   public static final TerminalUiUtils INSTANCE = new TerminalUiUtils();
/*     */   @NotNull
/*     */   private static final String TERMINAL_OUTPUT_CONTEXT_MENU = "Terminal.OutputContextMenu";
/*     */   public static final int GREEN_COLOR_INDEX = 2;
/*     */   public static final int YELLOW_COLOR_INDEX = 3;
/*     */   
/*     */   @NotNull
/*     */   public final EditorImpl createOutputEditor(@NotNull Document document, @NotNull Project project, @NotNull JBTerminalSystemSettingsProviderBase settings) {
/*  69 */     Intrinsics.checkNotNullParameter(document, "document"); Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(settings, "settings"); Intrinsics.checkNotNull(EditorFactory.getInstance().createEditor(document, project, EditorKind.CONSOLE), "null cannot be cast to non-null type com.intellij.openapi.editor.impl.EditorImpl"); EditorImpl editor = (EditorImpl)EditorFactory.getInstance().createEditor(document, project, EditorKind.CONSOLE);
/*  70 */     editor.setScrollToCaret(false);
/*  71 */     editor.setRendererMode(true);
/*  72 */     editor.getScrollPane().setBorder((Border)JBUI.Borders.empty());
/*  73 */     editor.getScrollPane().setHorizontalScrollBarPolicy(31);
/*  74 */     editor.getGutterComponentEx().setPaintBackground(false);
/*  75 */     editor.getGutterComponentEx().setRightFreePaintersAreaState(EditorGutterFreePainterAreaState.HIDE);
/*     */     
/*  77 */     EditorColorsScheme editorColorsScheme1 = editor.getColorsScheme(), $this$createOutputEditor_u24lambda_u240 = editorColorsScheme1; int $i$a$-apply-TerminalUiUtils$createOutputEditor$1 = 0;
/*  78 */     $this$createOutputEditor_u24lambda_u240.setEditorFontName(settings.getTerminalFont().getFontName());
/*  79 */     $this$createOutputEditor_u24lambda_u240.setEditorFontSize(settings.getTerminalFont().getSize());
/*  80 */     $this$createOutputEditor_u24lambda_u240.setLineSpacing(1.0F);
/*     */ 
/*     */     
/*  83 */     EditorSettings editorSettings1 = editor.getSettings(), $this$createOutputEditor_u24lambda_u241 = editorSettings1; int $i$a$-apply-TerminalUiUtils$createOutputEditor$2 = 0;
/*  84 */     $this$createOutputEditor_u24lambda_u241.setShowingSpecialChars(false);
/*  85 */     $this$createOutputEditor_u24lambda_u241.setLineNumbersShown(false);
/*  86 */     $this$createOutputEditor_u24lambda_u241.setGutterIconsShown(false);
/*  87 */     $this$createOutputEditor_u24lambda_u241.setRightMarginShown(false);
/*  88 */     $this$createOutputEditor_u24lambda_u241.setFoldingOutlineShown(false);
/*  89 */     $this$createOutputEditor_u24lambda_u241.setCaretRowShown(false);
/*  90 */     $this$createOutputEditor_u24lambda_u241.setAdditionalLinesCount(0);
/*  91 */     $this$createOutputEditor_u24lambda_u241.setAdditionalColumnsCount(0);
/*  92 */     $this$createOutputEditor_u24lambda_u241.setAdditionalPageAtBottom(false);
/*  93 */     $this$createOutputEditor_u24lambda_u241.setBlockCursor(true);
/*  94 */     $this$createOutputEditor_u24lambda_u241.setWhitespacesShown(false);
/*     */ 
/*     */     
/*  97 */     installPopupMenu((EditorEx)editor);
/*  98 */     return editor;
/*     */   }
/*     */   
/*     */   private final void installPopupMenu(EditorEx editor) {
/* 102 */     editor.installPopupHandler((EditorPopupHandler)new TerminalUiUtils$installPopupMenu$1(editor)); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils$installPopupMenu$1", "Lcom/intellij/openapi/editor/impl/ContextMenuPopupHandler;", "getActionGroup", "Lcom/intellij/openapi/actionSystem/ActionGroup;", "event", "Lcom/intellij/openapi/editor/event/EditorMouseEvent;", "ej-core"})
/* 103 */   public static final class TerminalUiUtils$installPopupMenu$1 extends ContextMenuPopupHandler { TerminalUiUtils$installPopupMenu$1(EditorEx $editor) {} public ActionGroup getActionGroup(EditorMouseEvent event) { Intrinsics.checkNotNullParameter(event, "event"); return TerminalUiUtils.INSTANCE.getPopupMenuGroup(this.$editor, event); }
/*     */      }
/*     */ 
/*     */   
/*     */   private final ActionGroup getPopupMenuGroup(EditorEx editor, EditorMouseEvent event) {
/* 108 */     ThreadingAssertions.assertEventDispatchThread();
/* 109 */     HyperlinkInfo info = EditorHyperlinkSupport.get((Editor)editor).getHyperlinkInfoByEvent(event);
/* 110 */     Object $this$asSafely$iv = info; int $i$f$asSafely = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     if (!($this$asSafely$iv instanceof HyperlinkWithPopupMenuInfo)); (HyperlinkWithPopupMenuInfo)null; ActionGroup customPopupMenuGroup = ((HyperlinkWithPopupMenuInfo)null != null) ? ((HyperlinkWithPopupMenuInfo)null).getPopupMenuGroup(event.getMouseEvent()) : null; Intrinsics.checkNotNull(ActionManager.getInstance().getAction("Terminal.OutputContextMenu"), "null cannot be cast to non-null type com.intellij.openapi.actionSystem.ActionGroup"); ActionGroup defaultPopupMenuGroup = (ActionGroup)ActionManager.getInstance().getAction("Terminal.OutputContextMenu"); $this$asSafely$iv = new ActionGroup[2]; $this$asSafely$iv[0] = customPopupMenuGroup; $this$asSafely$iv[1] = defaultPopupMenuGroup; return concatGroups((ActionGroup[])$this$asSafely$iv); } private final ActionGroup concatGroups(ActionGroup... groups) { ActionGroup[] arrayOfActionGroup1 = groups; int $i$f$mapNotNull = 0;
/* 325 */     ActionGroup[] arrayOfActionGroup2 = arrayOfActionGroup1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 333 */     arrayOfActionGroup3 = arrayOfActionGroup2; int $i$f$forEach = 0;
/* 334 */     byte b2 = 0; int i = arrayOfActionGroup3.length; if (b2 < i) { Object element$iv$iv$iv = arrayOfActionGroup3[b2], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0;
/*     */       Object object1 = element$iv$iv;
/*     */       int $i$a$-mapNotNull-TerminalUiUtils$concatGroups$actionsPerGroup$1 = 0; }
/*     */     
/* 338 */     List actionsPerGroup = (List)destination$iv$iv; List list1 = actionsPerGroup; ArrayList arrayList1 = new ArrayList(); byte b1 = 0; for (ActionGroup[] arrayOfActionGroup3 : list1) { $i$f$forEach = b1++; if ($i$f$forEach < 0) CollectionsKt.throwIndexOverflow();  List list = (List)arrayOfActionGroup3; int index = $i$f$forEach, $i$a$-flatMapIndexedIterable-TerminalUiUtils$concatGroups$1 = 0; CollectionsKt.addAll(arrayList1, (index > 0) ? CollectionsKt.plus(CollectionsKt.listOf(Separator.create()), list) : list); }  ArrayList arrayList2 = arrayList1; return (ActionGroup)new DefaultActionGroup(arrayList2); } @NotNull public final ShortcutSet createSingleShortcutSet(int keyCode, int modifiers) { KeyStroke keyStroke = KeyStroke.getKeyStroke(keyCode, modifiers); return (ShortcutSet)new CustomShortcutSet(keyStroke); } @NotNull public final TermSize calculateTerminalSize(@NotNull Dimension componentSize, @NotNull Dimension2D charSize) { Intrinsics.checkNotNullParameter(componentSize, "componentSize"); Intrinsics.checkNotNullParameter(charSize, "charSize"); double width = componentSize.width / charSize.getWidth(); double height = componentSize.height / charSize.getHeight(); return ensureTermMinimumSize(new TermSize((int)width, (int)height)); } private final TermSize ensureTermMinimumSize(TermSize size) { return new TermSize(Math.max(5, size.getColumns()), Math.max(2, size.getRows())); } @RequiresEdt @NotNull public final CompletableFuture<?> getComponentSizeInitializedFuture(@NotNull Component component) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'component'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: invokevirtual getSize : ()Ljava/awt/Dimension;
/*     */     //   11: astore_2
/*     */     //   12: aload_2
/*     */     //   13: getfield width : I
/*     */     //   16: ifgt -> 26
/*     */     //   19: aload_2
/*     */     //   20: getfield height : I
/*     */     //   23: ifle -> 40
/*     */     //   26: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   29: invokestatic completedFuture : (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   32: dup
/*     */     //   33: ldc_w 'completedFuture(...)'
/*     */     //   36: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   39: areturn
/*     */     //   40: aload_1
/*     */     //   41: iconst_0
/*     */     //   42: invokestatic isShowing : (Ljava/awt/Component;Z)Z
/*     */     //   45: ifne -> 62
/*     */     //   48: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   51: invokestatic completedFuture : (Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   54: dup
/*     */     //   55: ldc_w 'completedFuture(...)'
/*     */     //   58: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   61: areturn
/*     */     //   62: new java/util/concurrent/CompletableFuture
/*     */     //   65: dup
/*     */     //   66: invokespecial <init> : ()V
/*     */     //   69: astore_3
/*     */     //   70: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils$getComponentSizeInitializedFuture$resizedListener$1
/*     */     //   73: dup
/*     */     //   74: aload_3
/*     */     //   75: invokespecial <init> : (Ljava/util/concurrent/CompletableFuture;)V
/*     */     //   78: astore #4
/*     */     //   80: aload_1
/*     */     //   81: aload #4
/*     */     //   83: checkcast java/awt/event/ComponentListener
/*     */     //   86: invokevirtual addComponentListener : (Ljava/awt/event/ComponentListener;)V
/*     */     //   89: aload_3
/*     */     //   90: aload_1
/*     */     //   91: aload #4
/*     */     //   93: <illegal opcode> invoke : (Ljava/awt/Component;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils$getComponentSizeInitializedFuture$resizedListener$1;)Lkotlin/jvm/functions/Function2;
/*     */     //   98: <illegal opcode> accept : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiConsumer;
/*     */     //   103: invokevirtual whenComplete : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   106: pop
/*     */     //   107: aload_3
/*     */     //   108: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #142	-> 7
/*     */     //   #143	-> 12
/*     */     //   #144	-> 26
/*     */     //   #146	-> 40
/*     */     //   #148	-> 48
/*     */     //   #150	-> 62
/*     */     //   #151	-> 70
/*     */     //   #156	-> 80
/*     */     //   #157	-> 89
/*     */     //   #160	-> 107
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   12	97	2	size	Ljava/awt/Dimension;
/*     */     //   70	39	3	componentResizedFuture	Ljava/util/concurrent/CompletableFuture;
/*     */     //   80	29	4	resizedListener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils$getComponentSizeInitializedFuture$resizedListener$1;
/*     */     //   0	109	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils;
/*     */     //   0	109	1	component	Ljava/awt/Component; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils$getComponentSizeInitializedFuture$resizedListener$1", "Ljava/awt/event/ComponentAdapter;", "componentResized", "", "e", "Ljava/awt/event/ComponentEvent;", "ej-core"}) public static final class TerminalUiUtils$getComponentSizeInitializedFuture$resizedListener$1 extends ComponentAdapter {
/*     */     TerminalUiUtils$getComponentSizeInitializedFuture$resizedListener$1(CompletableFuture<Unit> $componentResizedFuture) {} public void componentResized(ComponentEvent e) { this.$componentResizedFuture.complete(Unit.INSTANCE); } } private static final void getComponentSizeInitializedFuture$lambda$5(Function2 $tmp0, Object p0, Object p1) { $tmp0.invoke(p0, p1); } private static final Unit getComponentSizeInitializedFuture$lambda$4(Component $component, TerminalUiUtils$getComponentSizeInitializedFuture$resizedListener$1 $resizedListener, Unit paramUnit, Throwable paramThrowable) { $component.removeComponentListener($resizedListener); return Unit.INSTANCE; } public final void cancelFutureByTimeout(@NotNull CompletableFuture future, long timeoutMillis, @NotNull Disposable parentDisposable) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'future'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #4
/*     */     //   9: ldc_w 'parentDisposable'
/*     */     //   12: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   15: new com/intellij/util/Alarm
/*     */     //   18: dup
/*     */     //   19: getstatic com/intellij/util/Alarm$ThreadToUse.SWING_THREAD : Lcom/intellij/util/Alarm$ThreadToUse;
/*     */     //   22: aload #4
/*     */     //   24: invokespecial <init> : (Lcom/intellij/util/Alarm$ThreadToUse;Lcom/intellij/openapi/Disposable;)V
/*     */     //   27: astore #5
/*     */     //   29: aload_1
/*     */     //   30: lload_2
/*     */     //   31: <illegal opcode> run : (Ljava/util/concurrent/CompletableFuture;J)Ljava/lang/Runnable;
/*     */     //   36: astore #6
/*     */     //   38: aload #5
/*     */     //   40: aload #6
/*     */     //   42: lload_2
/*     */     //   43: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*     */     //   46: invokevirtual addRequest : (Ljava/lang/Runnable;JLcom/intellij/openapi/application/ModalityState;)V
/*     */     //   49: aload #5
/*     */     //   51: checkcast com/intellij/openapi/Disposable
/*     */     //   54: aload_1
/*     */     //   55: <illegal opcode> dispose : (Ljava/util/concurrent/CompletableFuture;)Lcom/intellij/openapi/Disposable;
/*     */     //   60: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   63: aload_1
/*     */     //   64: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils$cancelFutureByTimeout$2
/*     */     //   67: dup
/*     */     //   68: aload #5
/*     */     //   70: invokespecial <init> : (Lcom/intellij/util/Alarm;)V
/*     */     //   73: checkcast kotlin/jvm/functions/Function2
/*     */     //   76: <illegal opcode> accept : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiConsumer;
/*     */     //   81: invokevirtual whenComplete : (Ljava/util/function/BiConsumer;)Ljava/util/concurrent/CompletableFuture;
/*     */     //   84: pop
/*     */     //   85: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #164	-> 15
/*     */     //   #165	-> 29
/*     */     //   #168	-> 38
/*     */     //   #170	-> 49
/*     */     //   #177	-> 63
/*     */     //   #180	-> 85
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   29	57	5	alarm	Lcom/intellij/util/Alarm;
/*     */     //   38	48	6	request	Ljava/lang/Runnable;
/*     */     //   0	86	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtils;
/*     */     //   0	86	1	future	Ljava/util/concurrent/CompletableFuture;
/*     */     //   0	86	2	timeoutMillis	J
/* 339 */     //   0	86	4	parentDisposable	Lcom/intellij/openapi/Disposable; } private static final void cancelFutureByTimeout$lambda$6(CompletableFuture $future, long $timeoutMillis) { $future.completeExceptionally(new IllegalStateException("Terminal component layout is timed out (>" + $timeoutMillis + "ms)")); } private final Color getEffectiveBackgroundNoDefault(TextStyle style, TerminalColorPalette palette) { TerminalColor it = style.getBackground(); int $i$a$-let-TerminalUiUtils$getEffectiveBackgroundNoDefault$1 = 0; style.getBackground(); return style.hasOption(TextStyle.Option.INVERSE) ? toForeground(style, palette) : ((style.getBackground() != null) ? AwtTransformers.toAwtColor(palette.getBackground(it)) : null); } private static final void cancelFutureByTimeout$lambda$8(CompletableFuture $future) { if (!$future.isDone()) ActionsKt.invokeLater(ModalityState.any(), $future::cancelFutureByTimeout$lambda$8$lambda$7);  } private static final Unit cancelFutureByTimeout$lambda$8$lambda$7(CompletableFuture $future) { $future.completeExceptionally(new IllegalStateException("parent disposed")); return Unit.INSTANCE; } private static final void cancelFutureByTimeout$lambda$9(Function2 $tmp0, Object p0, Object p1) { $tmp0.invoke(p0, p1); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class TerminalUiUtils$cancelFutureByTimeout$2 implements Function2 { public final void invoke(Object param1Object, Throwable param1Throwable) { Disposer.dispose((Disposable)this.$alarm); } TerminalUiUtils$cancelFutureByTimeout$2(Alarm $alarm) {} } public final float toFloatAndScale(int value) { return JBUIScale.scale(value); } @NotNull public final TextAttributes toTextAttributes$ej_core(@NotNull TextStyle $this$toTextAttributes, @NotNull TerminalColorPalette palette) { Intrinsics.checkNotNullParameter($this$toTextAttributes, "<this>"); Intrinsics.checkNotNullParameter(palette, "palette"); TextAttributes textAttributes1 = new TextAttributes(), attr = textAttributes1; int $i$a$-also-TerminalUiUtils$toTextAttributes$1 = 0; attr.setBackgroundColor(INSTANCE.getEffectiveBackgroundNoDefault($this$toTextAttributes, palette)); attr.setForegroundColor(INSTANCE.getResultForeground($this$toTextAttributes, palette)); if ($this$toTextAttributes.hasOption(TextStyle.Option.BOLD)) attr.setFontType(attr.getFontType() | 0x1);  if ($this$toTextAttributes.hasOption(TextStyle.Option.ITALIC)) attr.setFontType(attr.getFontType() | 0x2);  if ($this$toTextAttributes.hasOption(TextStyle.Option.UNDERLINED)) attr.withAdditionalEffect(EffectType.LINE_UNDERSCORE, attr.getForegroundColor());  return textAttributes1; } @NotNull public final Color getAwtForegroundByIndex(@NotNull TerminalColorPalette $this$getAwtForegroundByIndex, int colorIndex) { Intrinsics.checkNotNullParameter($this$getAwtForegroundByIndex, "<this>"); Color color1 = ((0 <= colorIndex) ? ((colorIndex < 16)) : false) ? $this$getAwtForegroundByIndex.getForeground(TerminalColor.index(colorIndex)) : $this$getAwtForegroundByIndex.getDefaultForeground(); Intrinsics.checkNotNull(color1); Color color = color1; Intrinsics.checkNotNull(AwtTransformers.toAwtColor(color)); return AwtTransformers.toAwtColor(color); } private final Color getResultForeground(TextStyle style, TerminalColorPalette palette) { Color foreground = getEffectiveForegroundOrDefault(style, palette); if (style.hasOption(TextStyle.Option.DIM)) { Color background = getEffectiveBackgroundOrDefault(style, palette); } else {  }  return foreground; } private final Color getEffectiveForegroundOrDefault(TextStyle style, TerminalColorPalette palette) { return style.hasOption(TextStyle.Option.INVERSE) ? toBackground(style, palette) : toForeground(style, palette); } private final Color getEffectiveBackgroundOrDefault(TextStyle style, TerminalColorPalette palette) { return style.hasOption(TextStyle.Option.INVERSE) ? toForeground(style, palette) : toBackground(style, palette); } private final Color toForeground(TextStyle style, TerminalColorPalette palette) { if (style.getForeground() != null) { Color color1; TerminalColor it = style.getForeground(); int $i$a$-let-TerminalUiUtils$toForeground$color$1 = 0; if (palette.getForeground(it) == null) { palette.getForeground(it); Color color2 = palette.getDefaultForeground(); Intrinsics.checkNotNull(AwtTransformers.toAwtColor(color2)); return AwtTransformers.toAwtColor(color2); }  Intrinsics.checkNotNull(AwtTransformers.toAwtColor(color1)); return AwtTransformers.toAwtColor(color1); }  color1 = palette.getForeground(it); Color color = palette.getDefaultForeground(); Intrinsics.checkNotNull(AwtTransformers.toAwtColor(color)); return AwtTransformers.toAwtColor(color); } private final Color toBackground(TextStyle style, TerminalColorPalette palette) { if (style.getBackground() != null) { Color color1; TerminalColor it = style.getBackground(); int $i$a$-let-TerminalUiUtils$toBackground$color$1 = 0;
/*     */       if (palette.getBackground(it) == null) {
/*     */         palette.getBackground(it);
/*     */         Color color2 = palette.getDefaultBackground();
/*     */         Intrinsics.checkNotNull(AwtTransformers.toAwtColor(color2));
/*     */         return AwtTransformers.toAwtColor(color2);
/*     */       } 
/*     */       Intrinsics.checkNotNull(AwtTransformers.toAwtColor(color1));
/*     */       return AwtTransformers.toAwtColor(color1); }
/*     */     
/*     */     color1 = palette.getBackground(it);
/*     */     Color color = palette.getDefaultBackground();
/*     */     Intrinsics.checkNotNull(AwtTransformers.toAwtColor(color));
/*     */     return AwtTransformers.toAwtColor(color); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextAttributesProvider plainAttributesProvider(int foregroundColorIndex, @NotNull TerminalColorPalette palette) {
/*     */     Intrinsics.checkNotNullParameter(palette, "palette");
/*     */     return (TextAttributesProvider)new TextStyleAdapter(new TextStyle(new TerminalColor(foregroundColorIndex), null), palette);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalUiUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */