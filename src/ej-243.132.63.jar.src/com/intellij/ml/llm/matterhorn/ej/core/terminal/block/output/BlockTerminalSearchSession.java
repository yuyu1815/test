/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.find.FindBundle;
/*     */ import com.intellij.find.FindModel;
/*     */ import com.intellij.find.SearchReplaceComponent;
/*     */ import com.intellij.find.SearchSession;
/*     */ import com.intellij.find.impl.livePreview.LivePreviewController;
/*     */ import com.intellij.find.impl.livePreview.SearchResults;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.application.ApplicationBundle;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.event.EditorFactoryEvent;
/*     */ import com.intellij.openapi.editor.event.EditorFactoryListener;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import com.intellij.openapi.util.text.StringUtil;
/*     */ import com.intellij.terminal.BlockTerminalColors;
/*     */ import com.intellij.ui.util.UiSizeUtilKt;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import java.util.List;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.text.JTextComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.plugins.terminal.TerminalBundle;
/*     */ import org.jetbrains.plugins.terminal.TerminalIcons;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\013\n\002\020\016\n\002\b\r\b\000\030\000 52\0020\0012\0020\0022\0020\003:\0042345B?\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r\022\016\b\002\020\016\032\b\022\004\022\0020\0200\017¢\006\004\b\021\020\022J\b\020\036\032\0020\027H\002J\b\020\037\032\0020\020H\002J\b\020 \032\0020\020H\026J\020\020!\032\0020\0202\006\020\"\032\0020\031H\026J\b\020#\032\0020\020H\026J\b\020$\032\0020\020H\002J\b\020%\032\0020\020H\002J\b\020&\032\0020\020H\002J\b\020'\032\0020\020H\002J\b\020(\032\0020)H\002J\022\020*\032\004\030\0010)2\006\020+\032\0020)H\002J\b\020,\032\0020\tH\026J\b\020-\032\0020\027H\026J\b\020.\032\0020\035H\026J\b\020/\032\0020\020H\026J\b\0200\032\0020\020H\026J\b\0201\032\0020\020H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\024\020\016\032\b\022\004\022\0020\0200\017X\004¢\006\002\n\000R\023\020\023\032\0070\024¢\006\002\b\025X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\031X\004¢\006\002\n\000R\016\020\032\032\0020\033X\004¢\006\002\n\000R\016\020\034\032\0020\035X\016¢\006\002\n\000¨\0066"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession;", "Lcom/intellij/find/SearchSession;", "Lcom/intellij/find/impl/livePreview/SearchResults$SearchResultsListener;", "Lcom/intellij/find/SearchReplaceComponent$Listener;", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "model", "Lcom/intellij/find/FindModel;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "selectionModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;", "closeCallback", "Lkotlin/Function0;", "", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/ex/EditorEx;Lcom/intellij/find/FindModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionModel;Lkotlin/jvm/functions/Function0;)V", "disposable", "Lcom/intellij/openapi/Disposable;", "Lorg/jetbrains/annotations/NotNull;", "component", "Lcom/intellij/find/SearchReplaceComponent;", "searchResults", "Lcom/intellij/find/impl/livePreview/SearchResults;", "livePreviewController", "Lcom/intellij/find/impl/livePreview/LivePreviewController;", "isSearchInBlock", "", "createSearchComponent", "findModelChanged", "searchFieldDocumentChanged", "searchResultsUpdated", "sr", "cursorMoved", "updateResults", "updateMultiLineStateIfNeeded", "updateUiWithFindModel", "updateEmptyText", "getEmptyText", "", "checkRegex", "text", "getFindModel", "getComponent", "hasMatches", "searchForward", "searchBackward", "close", "TerminalSearchPresentation", "TerminalSearchResults", "SearchInBlockAction", "Companion", "ej-core"})
/*     */ public final class BlockTerminalSearchSession implements SearchSession, SearchResults.SearchResultsListener, SearchReplaceComponent.Listener {
/*  41 */   public BlockTerminalSearchSession(@NotNull Project project, @NotNull EditorEx editor, @NotNull FindModel model, @NotNull TerminalOutputModel outputModel, @NotNull TerminalSelectionModel selectionModel, @NotNull Function0<Unit> closeCallback) { this.project = project;
/*  42 */     this.editor = editor;
/*  43 */     this.model = model;
/*  44 */     this.outputModel = outputModel;
/*  45 */     this.selectionModel = selectionModel;
/*  46 */     this.closeCallback = closeCallback;
/*     */     
/*  48 */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable(BlockTerminalSearchSession.class.getName()), "newDisposable(...)"); this.disposable = Disposer.newDisposable(BlockTerminalSearchSession.class.getName());
/*  49 */     this.component = createSearchComponent();
/*  50 */     this.searchResults = new TerminalSearchResults();
/*  51 */     this.livePreviewController = new LivePreviewController(this.searchResults, this, this.disposable);
/*  52 */     this.isSearchInBlock = Companion.isSearchInBlock(this.model);
/*     */ 
/*     */     
/*  55 */     this.searchResults.setMatchesLimit(10000);
/*  56 */     this.livePreviewController.on();
/*  57 */     this.livePreviewController.setLivePreview(new LivePreview(this.searchResults, new TerminalSearchPresentation((Editor)this.editor)));
/*     */     
/*  59 */     this.component.addListener(this);
/*  60 */     this.searchResults.addListener(this);
/*  61 */     this.model.addObserver(new FindModel.FindModelObserver() {
/*     */           private boolean preventRecursion;
/*     */           
/*     */           public void findModelChanged(FindModel findModel) {
/*  65 */             if (!this.preventRecursion) {
/*     */               try {
/*  67 */                 this.preventRecursion = true;
/*  68 */                 BlockTerminalSearchSession.this.findModelChanged();
/*     */               } finally {
/*     */                 
/*  71 */                 this.preventRecursion = false;
/*     */               } 
/*     */             }
/*     */           }
/*     */         });
/*  76 */     this.selectionModel.addListener(new TerminalSelectionModel.TerminalSelectionListener() { public void hoverChanged(CommandBlock oldHovered, CommandBlock newHovered) { TerminalSelectionModel.TerminalSelectionListener.DefaultImpls.hoverChanged(this, oldHovered, newHovered); }
/*     */            public void selectionChanged(List oldSelection, List newSelection) {
/*  78 */             Intrinsics.checkNotNullParameter(oldSelection, "oldSelection"); Intrinsics.checkNotNullParameter(newSelection, "newSelection"); BlockTerminalSearchSession.Companion.setSearchInBlock(BlockTerminalSearchSession.this.model, !newSelection.isEmpty());
/*  79 */             BlockTerminalSearchSession.this.searchResults.clear();
/*  80 */             BlockTerminalSearchSession.this.updateResults();
/*     */           } }
/*  82 */         this.disposable);
/*     */     
/*  84 */     EditorFactory.getInstance().addEditorFactoryListener(new EditorFactoryListener() {
/*     */           public void editorReleased(EditorFactoryEvent event) {
/*  86 */             Intrinsics.checkNotNullParameter(event, "event"); if (event.getEditor() == BlockTerminalSearchSession.this.editor) {
/*  87 */               Disposer.dispose(BlockTerminalSearchSession.this.disposable);
/*  88 */               BlockTerminalSearchSession.this.livePreviewController.dispose();
/*     */             } 
/*     */           }
/*  91 */         }this.disposable);
/*     */     
/*  93 */     Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = Integer.valueOf(0); arrayOfObject[1] = Integer.valueOf(0); this.component.setStatusText(ApplicationBundle.message("editorsearch.current.cursor.position", arrayOfObject));
/*  94 */     updateUiWithFindModel();
/*  95 */     updateMultiLineStateIfNeeded();
/*  96 */     ActionsKt.invokeLater$default(null, this::_init_$lambda$1, 1, null); } private static final Unit _init_$lambda$0() { return Unit.INSTANCE; }
/*  97 */   private static final Unit _init_$lambda$1(BlockTerminalSearchSession this$0) { this$0.component.updateActions();
/*  98 */     return Unit.INSTANCE; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final SearchReplaceComponent createSearchComponent() {
/* 104 */     AnAction[] arrayOfAnAction = new AnAction[3]; arrayOfAnAction[0] = (AnAction)new StatusTextAction(); arrayOfAnAction[1] = (AnAction)new PrevOccurrenceAction(); arrayOfAnAction[2] = (AnAction)new NextOccurrenceAction();
/* 105 */     arrayOfAnAction = new AnAction[3]; arrayOfAnAction[0] = (AnAction)new SearchInBlockAction(); arrayOfAnAction[1] = (AnAction)new ToggleMatchCase(); arrayOfAnAction[2] = (AnAction)new ToggleRegex();
/*     */ 
/*     */     
/* 108 */     Intrinsics.checkNotNullExpressionValue(SearchReplaceComponent.buildFor(this.project, this.editor.getContentComponent(), this).addPrimarySearchActions(arrayOfAnAction).addExtraSearchActions(arrayOfAnAction).withNewLineButton(false).withCloseAction(this::close).build(), "build(...)"); SearchReplaceComponent searchReplaceComponent1 = SearchReplaceComponent.buildFor(this.project, this.editor.getContentComponent(), this).addPrimarySearchActions(arrayOfAnAction).addExtraSearchActions(arrayOfAnAction).withNewLineButton(false).withCloseAction(this::close).build(), it = searchReplaceComponent1; int $i$a$-also-BlockTerminalSearchSession$createSearchComponent$2 = 0;
/* 109 */     JTextComponent jTextComponent = it.getSearchTextComponent(); if (((jTextComponent instanceof javax.swing.JTextArea) ? jTextComponent : null) != null) { ((jTextComponent instanceof javax.swing.JTextArea) ? jTextComponent : null).setColumns(14); } else { (jTextComponent instanceof javax.swing.JTextArea) ? jTextComponent : null; }
/* 110 */      UiSizeUtilKt.setPreferredWidth((JComponent)it, JBUI.scale(500));
/* 111 */     UiSizeUtilKt.setMaximumWidth((JComponent)it, JBUI.scale(500));
/* 112 */     it.setBorder(JBUI.Borders.customLine(JBUI.CurrentTheme.Editor.BORDER_COLOR, 0, 1, 1, 0));
/*     */     return searchReplaceComponent1;
/*     */   }
/*     */   
/*     */   private final void findModelChanged() {
/* 117 */     if (Companion.isSearchInBlock(this.model) != this.isSearchInBlock) {
/* 118 */       this.isSearchInBlock = Companion.isSearchInBlock(this.model);
/*     */       
/* 120 */       this.searchResults.getCursor(); int offset = (this.searchResults.getCursor() != null) ? this.searchResults.getCursor().getStartOffset() : this.editor.getCaretModel().getOffset();
/* 121 */       CommandBlock block = TerminalOutputModelKt.getByOffset(this.outputModel, offset); int $i$a$-let-BlockTerminalSearchSession$findModelChanged$1 = 0;
/* 122 */       this.selectionModel.setSelectedBlocks(CollectionsKt.listOf(block));
/*     */       
/*     */       TerminalOutputModelKt.getByOffset(this.outputModel, offset);
/* 125 */       if (!this.isSearchInBlock) {
/* 126 */         this.selectionModel.setSelectedBlocks(CollectionsKt.emptyList());
/*     */       }
/*     */     } 
/* 129 */     updateUiWithFindModel();
/* 130 */     this.searchResults.clear();
/* 131 */     updateResults();
/* 132 */     FindModel findModel1 = FindManager.getInstance(this.project).getFindInFileModel(), $this$findModelChanged_u24lambda_u244 = findModel1; int $i$a$-apply-BlockTerminalSearchSession$findModelChanged$2 = 0;
/* 133 */     $this$findModelChanged_u24lambda_u244.setStringToFind(this.model.getStringToFind());
/* 134 */     $this$findModelChanged_u24lambda_u244.setCaseSensitive(this.model.isCaseSensitive());
/* 135 */     $this$findModelChanged_u24lambda_u244.setRegularExpressions(this.model.isRegularExpressions());
/*     */   }
/*     */ 
/*     */   
/*     */   public void searchFieldDocumentChanged() {
/* 140 */     if (this.editor.isDisposed())
/* 141 */       return;  this.model.setStringToFind(this.component.getSearchTextComponent().getText());
/* 142 */     updateResults();
/* 143 */     updateMultiLineStateIfNeeded();
/*     */   }
/*     */   
/*     */   public void searchResultsUpdated(@NotNull SearchResults sr) {
/* 147 */     Intrinsics.checkNotNullParameter(sr, "sr"); if (sr.getFindModel() == null) {
/*     */       return;
/*     */     }
/* 150 */     int matchesCount = sr.getMatchesCount();
/* 151 */     int cursorIndex = sr.getCursorVisualIndex();
/*     */     
/* 153 */     Object[] arrayOfObject = new Object[1]; arrayOfObject[0] = Integer.valueOf(this.searchResults.getMatchesLimit());
/* 154 */     arrayOfObject = new Object[2]; arrayOfObject[0] = Integer.valueOf(cursorIndex); arrayOfObject[1] = Integer.valueOf(matchesCount);
/* 155 */     arrayOfObject = new Object[2]; arrayOfObject[0] = Integer.valueOf(0); arrayOfObject[1] = Integer.valueOf(matchesCount); String str1 = (matchesCount > this.searchResults.getMatchesLimit()) ? ApplicationBundle.message("editorsearch.toomuch", arrayOfObject) : ((cursorIndex != -1) ? ApplicationBundle.message("editorsearch.current.cursor.position", arrayOfObject) : ApplicationBundle.message("editorsearch.current.cursor.position", arrayOfObject)); Intrinsics.checkNotNull(str1);
/*     */     String status = str1;
/* 157 */     this.component.setStatusText(status);
/* 158 */     this.component.updateActions();
/*     */   }
/*     */   
/*     */   public void cursorMoved() {
/* 162 */     this.component.updateActions();
/*     */   }
/*     */   
/*     */   private final void updateResults() {
/* 166 */     Intrinsics.checkNotNullExpressionValue(this.model.getStringToFind(), "getStringToFind(...)"); String text = this.model.getStringToFind();
/* 167 */     if ((((CharSequence)text).length() > 0)) {
/* 168 */       if (this.model.isRegularExpressions()) {
/* 169 */         String str = checkRegex(text); if (str != null) { String warning = str; int $i$a$-let-BlockTerminalSearchSession$updateResults$1 = 0;
/* 170 */           this.searchResults.clear();
/* 171 */           this.component.setStatusText(warning);
/*     */           return; }
/*     */       
/*     */       } 
/* 175 */       this.livePreviewController.updateInBackground(this.model, true);
/*     */     } else {
/*     */       
/* 178 */       Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = Integer.valueOf(0); arrayOfObject[1] = Integer.valueOf(0); this.component.setStatusText(ApplicationBundle.message("editorsearch.current.cursor.position", arrayOfObject));
/* 179 */       this.searchResults.clear();
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void updateMultiLineStateIfNeeded() {
/* 184 */     Intrinsics.checkNotNullExpressionValue(this.component.getSearchTextComponent().getText(), "getText(...)"); this.model.setMultiline(StringsKt.contains$default(this.component.getSearchTextComponent().getText(), "\n", false, 2, null));
/*     */   }
/*     */   
/*     */   private final void updateUiWithFindModel() {
/* 188 */     this.component.update(this.model.getStringToFind(), this.model.getStringToReplace(), this.model.isReplaceState(), this.model.isMultiline());
/* 189 */     updateEmptyText();
/*     */   }
/*     */   
/*     */   private final void updateEmptyText() {
/* 193 */     Intrinsics.checkNotNullExpressionValue(this.component.getSearchTextComponent(), "getSearchTextComponent(...)"); JTextComponent searchComponent = this.component.getSearchTextComponent();
/* 194 */     if (searchComponent instanceof ComponentWithEmptyText) {
/* 195 */       ((ComponentWithEmptyText)searchComponent).getEmptyText().setText(getEmptyText());
/*     */     }
/*     */   }
/*     */   
/*     */   private final String getEmptyText() {
/* 200 */     if (Companion.isSearchInBlock(this.model)) {
/* 201 */       Intrinsics.checkNotNullExpressionValue(TerminalBundle.message("search.in.block", new Object[0]), "message(...)"); return StringsKt.replace$default(TerminalBundle.message("search.in.block", new Object[0]), "\033", "", false, 4, null);
/*     */     } 
/*     */     
/* 204 */     List<String> options = (List)new SmartList();
/* 205 */     if (this.model.isCaseSensitive()) { Intrinsics.checkNotNullExpressionValue(getEmptyText$getOptionText("find.case.sensitive"), "getEmptyText$getOptionText(...)"); options.add(getEmptyText$getOptionText("find.case.sensitive")); }
/* 206 */      if (this.model.isRegularExpressions()) { Intrinsics.checkNotNullExpressionValue(getEmptyText$getOptionText("find.regex"), "getEmptyText$getOptionText(...)"); options.add(getEmptyText$getOptionText("find.regex")); }
/* 207 */      switch (options.size()) { case 0: 
/*     */       case 1:
/* 209 */         arrayOfObject = new Object[1]; arrayOfObject[0] = options.get(0); }
/* 210 */      Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = options.get(0); arrayOfObject[1] = options.get(1); String str1 = FindBundle.message("emptyText.used.options", arrayOfObject); Intrinsics.checkNotNull(str1);
/*     */     String text = str1;
/* 212 */     Intrinsics.checkNotNullExpressionValue(StringUtil.capitalize(text), "capitalize(...)"); return StringUtil.capitalize(text);
/*     */   }
/*     */   private static final String getEmptyText$getOptionText(String key) {
/*     */     Intrinsics.checkNotNullExpressionValue(FindBundle.message(key, new Object[0]), "message(...)");
/*     */     return StringUtil.toLowerCase(StringsKt.replace$default(FindBundle.message(key, new Object[0]), "\033", "", false, 4, null));
/*     */   }
/*     */   
/*     */   private final String checkRegex(String text) {
/*     */     try {
/* 221 */       new Regex(text);
/*     */     }
/* 223 */     catch (PatternSyntaxException e) {
/* 224 */       return FindBundle.message("find.incorrect.regexp", new Object[0]);
/*     */     } 
/* 226 */     CharSequence charSequence = text; return (new Regex("\\|+")).matches(charSequence) ? 
/* 227 */       ApplicationBundle.message("editorsearch.empty.string.matches", new Object[0]) : 
/*     */       
/* 229 */       null;
/*     */   }
/*     */   @NotNull
/* 232 */   public FindModel getFindModel() { return this.model; } @NotNull
/*     */   public SearchReplaceComponent getComponent() {
/* 234 */     return this.component;
/*     */   } public boolean hasMatches() {
/* 236 */     return this.searchResults.hasMatches();
/*     */   }
/*     */   public void searchForward() {
/* 239 */     this.livePreviewController.moveCursor(SearchResults.Direction.DOWN);
/*     */   }
/*     */   
/*     */   public void searchBackward() {
/* 243 */     this.livePreviewController.moveCursor(SearchResults.Direction.UP);
/*     */   }
/*     */   
/*     */   public void close() {
/* 247 */     Disposer.dispose(this.disposable);
/* 248 */     this.livePreviewController.dispose();
/* 249 */     this.closeCallback.invoke();
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\005\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\0020\0078VX\004¢\006\006\032\004\b\013\020\tR\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\020\032\0020\rX\004¢\006\b\n\000\032\004\b\021\020\017¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchPresentation;", "Lcom/intellij/find/impl/livePreview/LivePreviewPresentation;", "editor", "Lcom/intellij/openapi/editor/Editor;", "<init>", "(Lcom/intellij/openapi/editor/Editor;)V", "defaultAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "getDefaultAttributes", "()Lcom/intellij/openapi/editor/markup/TextAttributes;", "cursorAttributes", "getCursorAttributes", "defaultLayer", "", "getDefaultLayer", "()I", "cursorLayer", "getCursorLayer", "ej-core"})
/*     */   private static final class TerminalSearchPresentation implements LivePreviewPresentation { @NotNull
/* 252 */     private final Editor editor; private final int defaultLayer; private final int cursorLayer; public TerminalSearchPresentation(@NotNull Editor editor) { this.editor = editor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 258 */       this.defaultLayer = 6001;
/* 259 */       this.cursorLayer = 6002; } @NotNull public TextAttributes getDefaultAttributes() { if (this.editor.getColorsScheme().getAttributes(BlockTerminalColors.SEARCH_ENTRY) == null) this.editor.getColorsScheme().getAttributes(BlockTerminalColors.SEARCH_ENTRY);  return new TextAttributes(); } public int getCursorLayer() { return this.cursorLayer; } @NotNull public TextAttributes getCursorAttributes() { if (this.editor.getColorsScheme().getAttributes(BlockTerminalColors.CURRENT_SEARCH_ENTRY) == null)
/*     */         this.editor.getColorsScheme().getAttributes(BlockTerminalColors.CURRENT_SEARCH_ENTRY);  return new TextAttributes(); } public int getDefaultLayer() { return this.defaultLayer; } }
/*     */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\024J\n\020\n\032\004\030\0010\013H\024¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults;", "Lcom/intellij/find/impl/livePreview/SearchResults;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession;)V", "getLocalSearchArea", "Lcom/intellij/find/impl/livePreview/SearchResults$SearchArea;", "editor", "Lcom/intellij/openapi/editor/Editor;", "findModel", "Lcom/intellij/find/FindModel;", "firstOccurrenceAtOrAfterCaret", "Lcom/intellij/find/FindResult;", "ej-core"}) @SourceDebugExtension({"SMAP\nBlockTerminalSearchSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalSearchSession.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1053#2:319\n360#2,7:320\n*S KotlinDebug\n*F\n+ 1 BlockTerminalSearchSession.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults\n*L\n265#1:319\n286#1:320,7\n*E\n"}) private final class TerminalSearchResults extends SearchResults {
/* 262 */     public TerminalSearchResults() { super((Editor)BlockTerminalSearchSession.this.editor, BlockTerminalSearchSession.this.project); } @NotNull
/*     */     protected SearchResults.SearchArea getLocalSearchArea(@NotNull Editor editor, @NotNull FindModel findModel) {
/* 264 */       Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(findModel, "findModel");
/* 265 */       Iterable<CommandBlock> $this$sortedBy$iv = BlockTerminalSearchSession.this.selectionModel.getSelectedBlocks(); int $i$f$sortedBy = 0; List blocks = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 319 */         CollectionsKt.sortedWith($this$sortedBy$iv, new BlockTerminalSearchSession$TerminalSearchResults$getLocalSearchArea$$inlined$sortedBy$1());
/*     */       int[] starts = new int[blocks.size()];
/*     */       int[] ends = new int[blocks.size()];
/*     */       for (int index = 0, i = blocks.size(); index < i; index++) {
/*     */         starts[index] = ((CommandBlock)blocks.get(index)).getStartOffset();
/*     */         ends[index] = ((CommandBlock)blocks.get(index)).getEndOffset();
/*     */       } 
/*     */       SearchResults.SearchArea searchArea = SearchResults.SearchArea.create(starts, ends);
/*     */       Intrinsics.checkNotNull(searchArea);
/*     */       int[] arrayOfInt1 = new int[1];
/*     */       arrayOfInt1[0] = 0;
/*     */       arrayOfInt1 = new int[1];
/*     */       arrayOfInt1[0] = Integer.MAX_VALUE;
/*     */       Intrinsics.checkNotNullExpressionValue(SearchResults.SearchArea.create(arrayOfInt1, arrayOfInt1), "create(...)");
/*     */       return BlockTerminalSearchSession.Companion.isSearchInBlock(findModel) ? searchArea : SearchResults.SearchArea.create(arrayOfInt1, arrayOfInt1);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     protected FindResult firstOccurrenceAtOrAfterCaret() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */       //   4: invokeinterface getScrollingModel : ()Lcom/intellij/openapi/editor/ScrollingModel;
/*     */       //   9: invokeinterface getVisibleArea : ()Ljava/awt/Rectangle;
/*     */       //   14: getfield y : I
/*     */       //   17: iconst_3
/*     */       //   18: aload_0
/*     */       //   19: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */       //   22: invokeinterface getLineHeight : ()I
/*     */       //   27: imul
/*     */       //   28: iadd
/*     */       //   29: istore_1
/*     */       //   30: aload_0
/*     */       //   31: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */       //   34: new java/awt/Point
/*     */       //   37: dup
/*     */       //   38: iconst_0
/*     */       //   39: iload_1
/*     */       //   40: invokespecial <init> : (II)V
/*     */       //   43: invokeinterface xyToLogicalPosition : (Ljava/awt/Point;)Lcom/intellij/openapi/editor/LogicalPosition;
/*     */       //   48: dup
/*     */       //   49: ldc 'xyToLogicalPosition(...)'
/*     */       //   51: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   54: astore_2
/*     */       //   55: aload_0
/*     */       //   56: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */       //   59: aload_2
/*     */       //   60: invokeinterface logicalPositionToOffset : (Lcom/intellij/openapi/editor/LogicalPosition;)I
/*     */       //   65: istore_3
/*     */       //   66: aload_0
/*     */       //   67: invokevirtual getOccurrences : ()Ljava/util/List;
/*     */       //   70: dup
/*     */       //   71: ldc 'getOccurrences(...)'
/*     */       //   73: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   76: astore #5
/*     */       //   78: iconst_0
/*     */       //   79: istore #6
/*     */       //   81: iconst_0
/*     */       //   82: istore #7
/*     */       //   84: aload #5
/*     */       //   86: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   91: astore #8
/*     */       //   93: aload #8
/*     */       //   95: invokeinterface hasNext : ()Z
/*     */       //   100: ifeq -> 150
/*     */       //   103: aload #8
/*     */       //   105: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   110: astore #9
/*     */       //   112: aload #9
/*     */       //   114: checkcast com/intellij/find/FindResult
/*     */       //   117: astore #10
/*     */       //   119: iconst_0
/*     */       //   120: istore #11
/*     */       //   122: aload #10
/*     */       //   124: invokevirtual getStartOffset : ()I
/*     */       //   127: iload_3
/*     */       //   128: if_icmplt -> 135
/*     */       //   131: iconst_1
/*     */       //   132: goto -> 136
/*     */       //   135: iconst_0
/*     */       //   136: ifeq -> 144
/*     */       //   139: iload #7
/*     */       //   141: goto -> 151
/*     */       //   144: iinc #7, 1
/*     */       //   147: goto -> 93
/*     */       //   150: iconst_m1
/*     */       //   151: istore #4
/*     */       //   153: iload #4
/*     */       //   155: ifle -> 175
/*     */       //   158: aload_0
/*     */       //   159: invokevirtual getOccurrences : ()Ljava/util/List;
/*     */       //   162: iload #4
/*     */       //   164: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   169: checkcast com/intellij/find/FindResult
/*     */       //   172: goto -> 191
/*     */       //   175: aload_0
/*     */       //   176: invokevirtual getOccurrences : ()Ljava/util/List;
/*     */       //   179: dup
/*     */       //   180: ldc 'getOccurrences(...)'
/*     */       //   182: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   185: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   188: checkcast com/intellij/find/FindResult
/*     */       //   191: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #283	-> 0
/*     */       //   #284	-> 30
/*     */       //   #285	-> 55
/*     */       //   #286	-> 66
/*     */       //   #320	-> 81
/*     */       //   #321	-> 84
/*     */       //   #322	-> 112
/*     */       //   #286	-> 122
/*     */       //   #322	-> 136
/*     */       //   #323	-> 139
/*     */       //   #324	-> 144
/*     */       //   #326	-> 150
/*     */       //   #286	-> 151
/*     */       //   #287	-> 153
/*     */       //   #288	-> 158
/*     */       //   #290	-> 175
/*     */       //   #287	-> 191
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   122	14	11	$i$a$-indexOfFirst-BlockTerminalSearchSession$TerminalSearchResults$firstOccurrenceAtOrAfterCaret$index$1	I
/*     */       //   119	17	10	it	Lcom/intellij/find/FindResult;
/*     */       //   112	35	9	item$iv	Ljava/lang/Object;
/*     */       //   81	70	6	$i$f$indexOfFirst	I
/*     */       //   84	67	7	index$iv	I
/*     */       //   78	73	5	$this$indexOfFirst$iv	Ljava/util/List;
/*     */       //   30	162	1	topY	I
/*     */       //   55	137	2	topLogicalPosition	Lcom/intellij/openapi/editor/LogicalPosition;
/*     */       //   66	126	3	topOffset	I
/*     */       //   153	39	4	index	I
/*     */       //   0	192	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\b\002\030\0002\0020\0012\0020\0022\0020\003B\007¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\024J\030\020\n\032\0020\0132\006\020\b\032\0020\t2\006\020\f\032\0020\007H\024¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$SearchInBlockAction;", "Lcom/intellij/find/editorHeaderActions/Embeddable;", "Lcom/intellij/openapi/actionSystem/ex/TooltipDescriptionProvider;", "Lcom/intellij/find/editorHeaderActions/EditorHeaderToggleAction;", "<init>", "()V", "isSelected", "", "session", "Lcom/intellij/find/SearchSession;", "setSelected", "", "selected", "ej-core"})
/*     */   private static final class SearchInBlockAction extends EditorHeaderToggleAction implements Embeddable, TooltipDescriptionProvider {
/*     */     public SearchInBlockAction() {
/*     */       super(TerminalBundle.message("search.in.block", new Object[0]), TerminalIcons.SearchInBlock, TerminalIcons.SearchInBlock, TerminalIcons.SearchInBlock);
/*     */     }
/*     */     
/*     */     protected boolean isSelected(@NotNull SearchSession session) {
/*     */       Intrinsics.checkNotNullParameter(session, "session");
/*     */       Intrinsics.checkNotNullExpressionValue(session.getFindModel(), "getFindModel(...)");
/*     */       return BlockTerminalSearchSession.Companion.isSearchInBlock(session.getFindModel());
/*     */     }
/*     */     
/*     */     protected void setSelected(@NotNull SearchSession session, boolean selected) {
/*     */       Intrinsics.checkNotNullParameter(session, "session");
/*     */       Intrinsics.checkNotNullExpressionValue(session.getFindModel(), "getFindModel(...)");
/*     */       BlockTerminalSearchSession.Companion.setSearchInBlock(session.getFindModel(), selected);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R(\020\b\032\0020\006*\0020\t2\006\020\007\032\0020\0068F@FX\016¢\006\f\032\004\b\b\020\n\"\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$Companion;", "", "<init>", "()V", "SEARCH_IN_BLOCK_KEY", "Lcom/intellij/openapi/util/Key;", "", "value", "isSearchInBlock", "Lcom/intellij/find/FindModel;", "(Lcom/intellij/find/FindModel;)Z", "setSearchInBlock", "(Lcom/intellij/find/FindModel;Z)V", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final boolean isSearchInBlock(@NotNull FindModel $this$isSearchInBlock) {
/*     */       Intrinsics.checkNotNullParameter($this$isSearchInBlock, "<this>");
/*     */       return Intrinsics.areEqual($this$isSearchInBlock.getCopyableUserData(BlockTerminalSearchSession.SEARCH_IN_BLOCK_KEY), Boolean.valueOf(true));
/*     */     }
/*     */     
/*     */     public final void setSearchInBlock(@NotNull FindModel $this$isSearchInBlock, boolean value) {
/*     */       Intrinsics.checkNotNullParameter($this$isSearchInBlock, "<this>");
/*     */       $this$isSearchInBlock.putCopyableUserData(BlockTerminalSearchSession.SEARCH_IN_BLOCK_KEY, Boolean.valueOf(value));
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final FindModel model;
/*     */   @NotNull
/*     */   private final TerminalOutputModel outputModel;
/*     */   @NotNull
/*     */   private final TerminalSelectionModel selectionModel;
/*     */   @NotNull
/*     */   private final Function0<Unit> closeCallback;
/*     */   @NotNull
/*     */   private final Disposable disposable;
/*     */   @NotNull
/*     */   private final SearchReplaceComponent component;
/*     */   @NotNull
/*     */   private final SearchResults searchResults;
/*     */   @NotNull
/*     */   private final LivePreviewController livePreviewController;
/*     */   private boolean isSearchInBlock;
/*     */   @NotNull
/*     */   private static final Key<Boolean> SEARCH_IN_BLOCK_KEY = Key.create("SearchInBlock");
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(Key.create("SearchInBlock"), "create(...)");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalSearchSession.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */