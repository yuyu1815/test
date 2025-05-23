/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import com.intellij.ide.util.TreeFileChooser;
/*     */ import com.intellij.ide.util.TreeFileChooserFactory;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.aiignore.AIIgnore;
/*     */ import com.intellij.openapi.fileChooser.FileChooserDescriptor;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\013\b\007\030\0002\0020\001B=\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t\022\006\020\013\032\0020\f\022\006\020\r\032\0020\f¢\006\004\b\016\020\017J\016\020\034\032\0020\0352\006\020\036\032\0020\031J\016\020\034\032\0020\0352\006\020\037\032\0020\nJ\016\020 \032\0020\0352\006\020\037\032\0020\nJ\006\020!\032\0020\035J\024\020\"\032\0020\0352\f\020#\032\b\022\004\022\0020\n0\030J\023\020$\032\b\022\004\022\0020%0\030H\000¢\006\002\b&J\006\020'\032\0020\035J\017\020(\032\004\030\0010)H\000¢\006\002\b*J\025\020+\032\0020\0352\006\020,\032\0020)H\000¢\006\002\b-J\025\020.\032\0020\0352\006\020/\032\00200H\000¢\006\002\b1J\025\0202\032\0020\0352\006\020/\032\00200H\000¢\006\002\b3J\r\0204\032\0020\035H\000¢\006\002\b5J\020\0206\032\0020\fH@¢\006\004\b7\0208J\020\0209\032\0020\0352\b\b\002\020:\032\0020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\022\020\023R\021\020\r\032\0020\f¢\006\b\n\000\032\004\b\r\020\023R\032\020\024\032\016\022\n\022\b\022\004\022\0020\n0\t0\025X\004¢\006\002\n\000R\035\020\026\032\016\022\n\022\b\022\004\022\0020\0310\0300\027¢\006\b\n\000\032\004\b\032\020\033¨\006;"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;", "project", "Lcom/intellij/openapi/project/Project;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "projectBasePath", "", "initialAttachedFiles", "Lkotlinx/collections/immutable/PersistentList;", "Ljava/nio/file/Path;", "allowBinaryFiles", "", "isEditable", "<init>", "(Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;ZZ)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getAllowBinaryFiles", "()Z", "attachedPaths", "Lkotlinx/coroutines/flow/MutableStateFlow;", "attachedFiles", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFile;", "getAttachedFiles", "()Lkotlinx/coroutines/flow/StateFlow;", "addFileToSelection", "", "attachedFile", "path", "removeSelectedContextFile", "clearFiles", "selectContextFiles", "paths", "getRecentFiles", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;", "getRecentFiles$ej_ui", "openProjectFileChooser", "getGuidelines", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/GuidelinesEntry;", "getGuidelines$ej_ui", "openGuidelineFile", "guidelines", "openGuidelineFile$ej_ui", "createPlaceholderGuidelineFile", "textField", "Landroidx/compose/foundation/text/input/TextFieldState;", "createPlaceholderGuidelineFile$ej_ui", "createAIIgnoreFile", "createAIIgnoreFile$ej_ui", "openAIIgnoreFile", "openAIIgnoreFile$ej_ui", "hasAIIgnoreFile", "hasAIIgnoreFile$ej_ui", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openProjectNativeFileChooser", "allowMultipleSelections", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nAttachedFilesViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachedFilesViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n226#2,5:208\n226#2,5:213\n226#2,5:218\n774#3:223\n865#3,2:224\n1557#3:226\n1628#3,3:227\n1557#3:231\n1628#3,3:232\n1#4:230\n*S KotlinDebug\n*F\n+ 1 AttachedFilesViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel\n*L\n49#1:208,5\n55#1:213,5\n64#1:218,5\n69#1:223\n69#1:224,2\n72#1:226\n72#1:227,3\n147#1:231\n147#1:232,3\n*E\n"})
/*     */ public final class AttachedFilesViewModel extends ViewModel {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   private final boolean allowBinaryFiles;
/*     */   private final boolean isEditable;
/*     */   
/*     */   @NotNull
/*     */   public final Project getProject() {
/*  33 */     return this.project;
/*     */   } @NotNull
/*     */   private final MutableStateFlow<PersistentList<Path>> attachedPaths; @NotNull
/*     */   private final StateFlow<List<AttachedFile>> attachedFiles; public static final int $stable = 8; public final boolean getAllowBinaryFiles() {
/*  37 */     return this.allowBinaryFiles; } public final boolean isEditable() {
/*  38 */     return this.isEditable;
/*     */   }
/*  40 */   public AttachedFilesViewModel(@NotNull Project project, @NotNull CoroutineScope coroutineScope, @NotNull String projectBasePath, @NotNull PersistentList initialAttachedFiles, boolean allowBinaryFiles, boolean isEditable) { super(coroutineScope, "AttachedFilesViewModel"); this.project = project; this.allowBinaryFiles = allowBinaryFiles; this.isEditable = isEditable;
/*  41 */     this.attachedPaths = StateFlowKt.MutableStateFlow(initialAttachedFiles);
/*  42 */     this.attachedFiles = CoroutineUtilKt.mapState((StateFlow)this.attachedPaths, projectBasePath::attachedFiles$lambda$0); } @NotNull public final StateFlow<List<AttachedFile>> getAttachedFiles() { return this.attachedFiles; } private static final List attachedFiles$lambda$0(String $projectBasePath, PersistentList paths) {
/*  43 */     Intrinsics.checkNotNullParameter(paths, "paths"); return AttachedFilesViewModelKt.access$mapState(paths, $projectBasePath);
/*     */   }
/*     */   public final void addFileToSelection(@NotNull AttachedFile attachedFile) {
/*  46 */     Intrinsics.checkNotNullParameter(attachedFile, "attachedFile"); addFileToSelection(attachedFile.getPath());
/*     */   }
/*  48 */   public final void addFileToSelection(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); if (((PersistentList)this.attachedPaths.getValue()).contains(path))
/*  49 */       return;  MutableStateFlow<PersistentList<Path>> $this$update$iv = this.attachedPaths; int $i$f$update = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true) {
/* 209 */       Object prevValue$iv = $this$update$iv.getValue();
/* 210 */       PersistentList it = (PersistentList)prevValue$iv; int $i$a$-update-AttachedFilesViewModel$addFileToSelection$1 = 0; Object nextValue$iv = it.add(path);
/* 211 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */         CompositeUiAction.INSTANCE.logTaskRecentFileAdded(path); 
/*     */     }  } public final void removeSelectedContextFile(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); if (!((PersistentList)this.attachedPaths.getValue()).contains(path))
/* 214 */       return;  MutableStateFlow<PersistentList<Path>> $this$update$iv = this.attachedPaths; int $i$f$update = 0; while (true) { Object prevValue$iv = $this$update$iv.getValue();
/* 215 */       PersistentList it = (PersistentList)prevValue$iv; int $i$a$-update-AttachedFilesViewModel$removeSelectedContextFile$1 = 0; Object nextValue$iv = it.remove(path);
/* 216 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */         CompositeUiAction.INSTANCE.logTaskRecentFileRemoved(path);  }
/*     */      } public final void clearFiles() { this.attachedPaths.setValue(ExtensionsKt.persistentListOf()); }
/* 219 */   public final void selectContextFiles(@NotNull List paths) { Intrinsics.checkNotNullParameter(paths, "paths"); MutableStateFlow<PersistentList<Path>> $this$update$iv = this.attachedPaths; int $i$f$update = 0; while (true) { Object prevValue$iv = $this$update$iv.getValue();
/* 220 */       PersistentList it = (PersistentList)prevValue$iv; int $i$a$-update-AttachedFilesViewModel$selectContextFiles$1 = 0; Object nextValue$iv = it.removeAll(paths).addAll(paths);
/* 221 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */         return;  }
/* 223 */      } @NotNull public final List<FileListEntry> getRecentFiles$ej_ui() { List list1 = CollectionsKt.reversed(EditorHistoryManager.Companion.getInstance(this.project).getFileList()); int $i$f$filter = 0; List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 224 */     for (Object element$iv$iv : list2) { VirtualFile virtualFile = (VirtualFile)element$iv$iv; int $i$a$-filter-AttachedFilesViewModel$getRecentFiles$1 = 0; if ((!virtualFile.getFileType().isBinary() || this.allowBinaryFiles)) collection.add(element$iv$iv);  }
/* 225 */      Iterable $this$filter$iv = collection; int $i$f$map = 0;
/* 226 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10)); int $i$f$mapTo = 0;
/* 227 */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/* 228 */       VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-AttachedFilesViewModel$getRecentFiles$2 = 0; Intrinsics.checkNotNullExpressionValue(virtualFile.getName(), "getName(...)"); Intrinsics.checkNotNullExpressionValue(virtualFile.getPath(), "getPath(...)"); Intrinsics.checkNotNullExpressionValue(Paths.get(virtualFile.getPath(), new String[0]), "get(...)");
/* 229 */     }  List it = (List)destination$iv$iv;
/* 230 */     int $i$a$-let-AttachedFilesViewModel$getRecentFiles$3 = 0; return UtilsKt.resolveFileNameConflicts(it); } private static final Unit openProjectNativeFileChooser$lambda$9(List virtualFiles) { Intrinsics.checkNotNullParameter(virtualFiles, "virtualFiles"); Iterable $this$map$iv = virtualFiles; int $i$f$map = 0;
/* 231 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 232 */     for (Object item$iv$iv : iterable1) {
/* 233 */       VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-AttachedFilesViewModel$openProjectNativeFileChooser$1$selectedPaths$1 = 0; collection.add(virtualFile.getPath());
/* 234 */     }  List selectedPaths = (List)destination$iv$iv;
/*     */     System.out.println("Selected file paths (within project): " + selectedPaths);
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   public final void openProjectFileChooser() {
/*     */     TreeFileChooserFactory chooserFactory = TreeFileChooserFactory.getInstance(this.project);
/*     */     Intrinsics.checkNotNullExpressionValue(chooserFactory.createFileChooser("Select a File", null, null, this::openProjectFileChooser$lambda$7), "createFileChooser(...)");
/*     */     TreeFileChooser chooser = chooserFactory.createFileChooser("Select a File", null, null, this::openProjectFileChooser$lambda$7);
/*     */     chooser.showDialog();
/*     */     PsiFile selectedFile = chooser.getSelectedFile();
/*     */     if (selectedFile != null) {
/*     */       Intrinsics.checkNotNullExpressionValue(selectedFile.getVirtualFile().getPath(), "getPath(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(Paths.get(selectedFile.getVirtualFile().getPath(), new String[0]), "get(...)");
/*     */       Path filepath = Paths.get(selectedFile.getVirtualFile().getPath(), new String[0]);
/*     */       List attachedPathsList = CollectionsKt.toList((Iterable)this.attachedPaths.getValue());
/*     */       if (!attachedPathsList.contains(filepath))
/*     */         addFileToSelection(filepath); 
/*     */     } else {
/*     */       System.out.println("User cancelled or no file was selected.");
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final boolean openProjectFileChooser$lambda$7(AttachedFilesViewModel this$0, PsiFile psiFile) {
/*     */     return (!(psiFile instanceof com.intellij.psi.PsiBinaryFile) || this$0.allowBinaryFiles);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final GuidelinesEntry getGuidelines$ej_ui() {
/*     */     return Guidelines.INSTANCE.getGuidelines$ej_ui(this.project);
/*     */   }
/*     */   
/*     */   public final void openGuidelineFile$ej_ui(@NotNull GuidelinesEntry guidelines) {
/*     */     Intrinsics.checkNotNullParameter(guidelines, "guidelines");
/*     */     Guidelines.INSTANCE.openGuidelineFile$ej_ui(this.project, guidelines);
/*     */   }
/*     */   
/*     */   public final void createPlaceholderGuidelineFile$ej_ui(@NotNull TextFieldState textField) {
/*     */     Intrinsics.checkNotNullParameter(textField, "textField");
/*     */     Guidelines.INSTANCE.createPlaceholderGuidelineFile$ej_ui(this.project, textField);
/*     */   }
/*     */   
/*     */   public final void createAIIgnoreFile$ej_ui(@NotNull TextFieldState textField) {
/*     */     Intrinsics.checkNotNullParameter(textField, "textField");
/*     */     AIIgnore.INSTANCE.createPlaceholderAiignoreFile(getScope(), this.project, textField.getText().toString());
/*     */   }
/*     */   
/*     */   public final void openAIIgnoreFile$ej_ui() {
/*     */     AIIgnore.INSTANCE.openAiIgnoreFile(getScope(), this.project);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object hasAIIgnoreFile$ej_ui(@NotNull Continuation $completion) {
/*     */     return AIIgnore.INSTANCE.hasAiignore(this.project, $completion);
/*     */   }
/*     */   
/*     */   public final void openProjectNativeFileChooser(boolean allowMultipleSelections) {
/*     */     VirtualFile baseDir = ProjectUtil.guessProjectDir(this.project);
/*     */     if (baseDir == null) {
/*     */       System.out.println("Could not determine project base directory.");
/*     */       return;
/*     */     } 
/*     */     VirtualFile[] arrayOfVirtualFile = new VirtualFile[1];
/*     */     arrayOfVirtualFile[0] = baseDir;
/*     */     FileChooserDescriptor descriptor = (new FileChooserDescriptor(true, false, false, false, false, allowMultipleSelections)).withRoots(arrayOfVirtualFile);
/*     */     FileChooser.chooseFiles(descriptor, this.project, null, AttachedFilesViewModel::openProjectNativeFileChooser$lambda$9::openProjectNativeFileChooser$lambda$10);
/*     */   }
/*     */   
/*     */   private static final void openProjectNativeFileChooser$lambda$10(Function1 $tmp0, Object p0) {
/*     */     $tmp0.invoke(p0);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\AttachedFilesViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */