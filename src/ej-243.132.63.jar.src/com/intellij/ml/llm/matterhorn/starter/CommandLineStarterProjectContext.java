/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*     */ import com.intellij.openapi.fileEditor.impl.EditorHistoryManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\020\020\t\032\0020\0052\006\020\006\032\0020\007H\002J\036\020\n\032\0020\0052\006\020\006\032\0020\0072\f\020\013\032\b\022\004\022\0020\r0\fH\002J\036\020\016\032\0020\0052\006\020\006\032\0020\0072\f\020\013\032\b\022\004\022\0020\r0\fH\002¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext;", "", "<init>", "()V", "setup", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "addOpenFiles", "files", "", "", "addRecentFiles", "matterhorn"})
/*     */ @SourceDebugExtension({"SMAP\nCommandLineStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n13409#2,2:381\n13409#2,2:383\n1863#3:385\n1864#3:387\n1863#3,2:388\n1#4:386\n*S KotlinDebug\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext\n*L\n112#1:381,2\n114#1:383,2\n120#1:385\n120#1:387\n128#1:388,2\n*E\n"})
/*     */ public final class CommandLineStarterProjectContext
/*     */ {
/*     */   @NotNull
/*     */   public static final CommandLineStarterProjectContext INSTANCE = new CommandLineStarterProjectContext();
/*     */   
/*     */   @Nullable
/*     */   public final Object setup(@NotNull Project project, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext$setup$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext$setup$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext$setup$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 236, 0 -> 92, 1 -> 152, 2 -> 224
/*     */     //   92: aload #4
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: new com/intellij/ml/llm/matterhorn/settings/MatterhornProperty
/*     */     //   100: dup
/*     */     //   101: ldc ''
/*     */     //   103: ldc ''
/*     */     //   105: aconst_null
/*     */     //   106: iconst_4
/*     */     //   107: aconst_null
/*     */     //   108: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   111: pop
/*     */     //   112: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState$Companion;
/*     */     //   115: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState
/*     */     //   118: dup
/*     */     //   119: aconst_null
/*     */     //   120: aconst_null
/*     */     //   121: iconst_3
/*     */     //   122: aconst_null
/*     */     //   123: invokespecial <init> : (Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   126: aload #5
/*     */     //   128: aload #5
/*     */     //   130: aload_1
/*     */     //   131: putfield L$0 : Ljava/lang/Object;
/*     */     //   134: aload #5
/*     */     //   136: iconst_1
/*     */     //   137: putfield label : I
/*     */     //   140: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   143: dup
/*     */     //   144: aload #6
/*     */     //   146: if_acmpne -> 168
/*     */     //   149: aload #6
/*     */     //   151: areturn
/*     */     //   152: aload #5
/*     */     //   154: getfield L$0 : Ljava/lang/Object;
/*     */     //   157: checkcast com/intellij/openapi/project/Project
/*     */     //   160: astore_1
/*     */     //   161: aload #4
/*     */     //   163: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   166: aload #4
/*     */     //   168: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState
/*     */     //   171: astore_3
/*     */     //   172: aload_3
/*     */     //   173: invokevirtual isEmpty : ()Z
/*     */     //   176: ifne -> 232
/*     */     //   179: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   182: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   185: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext$setup$2
/*     */     //   188: dup
/*     */     //   189: aload_1
/*     */     //   190: aload_3
/*     */     //   191: aconst_null
/*     */     //   192: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;Lkotlin/coroutines/Continuation;)V
/*     */     //   195: checkcast kotlin/jvm/functions/Function2
/*     */     //   198: aload #5
/*     */     //   200: aload #5
/*     */     //   202: aconst_null
/*     */     //   203: putfield L$0 : Ljava/lang/Object;
/*     */     //   206: aload #5
/*     */     //   208: iconst_2
/*     */     //   209: putfield label : I
/*     */     //   212: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   215: dup
/*     */     //   216: aload #6
/*     */     //   218: if_acmpne -> 231
/*     */     //   221: aload #6
/*     */     //   223: areturn
/*     */     //   224: aload #4
/*     */     //   226: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   229: aload #4
/*     */     //   231: areturn
/*     */     //   232: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   235: areturn
/*     */     //   236: new java/lang/IllegalStateException
/*     */     //   239: dup
/*     */     //   240: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   242: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   245: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 60
/*     */     //   #98	-> 97
/*     */     //   #99	-> 112
/*     */     //   #97	-> 149
/*     */     //   #100	-> 172
/*     */     //   #101	-> 179
/*     */     //   #97	-> 221
/*     */     //   #108	-> 231
/*     */     //   #97	-> 236
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	55	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   161	54	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   172	43	3	projectState	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectState;
/*     */     //   0	246	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	186	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	179	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {99, 101}, i = {0}, s = {"L$0"}, n = {"project"}, m = "setup", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarterProjectContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandLineStarterProjectContext$setup$1
/*     */     extends ContinuationImpl
/*     */   {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     CommandLineStarterProjectContext$setup$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandLineStarterProjectContext.this.setup(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarterProjectContext$setup$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\004\030\0010\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nCommandLineStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext$setup$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,380:1\n1#2:381\n*E\n"})
/*     */   static final class CommandLineStarterProjectContext$setup$2
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     CommandLineStarterProjectContext$setup$2(Project $project, CommandLineStarterProjectState $projectState, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super CommandLineStarterProjectContext$setup$2> $completion) {
/*     */       return (Continuation<Unit>)new CommandLineStarterProjectContext$setup$2(this.$project, this.$projectState, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((CommandLineStarterProjectContext$setup$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       List<String> list1;
/*     */       Project project;
/*     */       List<String> it;
/*     */       int $i$a$-let-CommandLineStarterProjectContext$setup$2$2;
/* 101 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 102 */           CommandLineStarterProjectContext.INSTANCE.clear(this.$project);
/* 103 */           if (this.$projectState.getRecentFiles() != null) { List<String> list2 = this.$projectState.getRecentFiles(); Project project1 = this.$project; List<String> list3 = list2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 381 */             int $i$a$-let-CommandLineStarterProjectContext$setup$2$1 = 0; CommandLineStarterProjectContext.INSTANCE.addRecentFiles(project1, list3); } else { this.$projectState.getRecentFiles(); }  list1 = this.$projectState.getOpenFiles(); project = this.$project; it = list1; $i$a$-let-CommandLineStarterProjectContext$setup$2$2 = 0; CommandLineStarterProjectContext.INSTANCE.addOpenFiles(project, it); this.$projectState.getOpenFiles(); return (this.$projectState.getOpenFiles() != null) ? Unit.INSTANCE : null; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } } private final void clear(Project project) { FileEditorManager editorManager = FileEditorManager.getInstance(project); Intrinsics.checkNotNullExpressionValue(editorManager.getOpenFiles(), "getOpenFiles(...)"); Object[] $this$forEach$iv = (Object[])editorManager.getOpenFiles(); int $i$f$forEach = 0; byte b = 0; int j = $this$forEach$iv.length; if (b < j) { Object element$iv = $this$forEach$iv[b]; VirtualFile it = (VirtualFile)element$iv; int $i$a$-forEach-CommandLineStarterProjectContext$clear$1 = 0; editorManager.closeFile(it); }
/*     */      EditorHistoryManager historyManager = EditorHistoryManager.Companion.getInstance(project); VirtualFile[] arrayOfVirtualFile = historyManager.getFiles(); int i = 0;
/* 383 */     j = 0; int k = arrayOfVirtualFile.length; if (j < k) { Object element$iv = arrayOfVirtualFile[j], object1 = element$iv; int $i$a$-forEach-CommandLineStarterProjectContext$clear$2 = 0; historyManager.removeFile((VirtualFile)object1); }
/*     */      } private final void addOpenFiles(Project project, List files) { FileEditorManager editorManager = FileEditorManager.getInstance(project); Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(project)); VirtualFile projectDir = ProjectUtil.guessProjectDir(project); Iterable $this$forEach$iv = files; int $i$f$forEach = 0;
/* 385 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); String it = (String)element$iv; int $i$a$-forEach-CommandLineStarterProjectContext$addOpenFiles$1 = 0; if (projectDir.findFileByRelativePath(it) != null)
/* 386 */       { VirtualFile virtualFile = projectDir.findFileByRelativePath(it); int $i$a$-let-CommandLineStarterProjectContext$addOpenFiles$1$1 = 0; editorManager.openFile(virtualFile); } else { projectDir.findFileByRelativePath(it); }
/*     */        }
/* 388 */      } private final void addRecentFiles(Project project, List files) { FileEditorManager editorManager = FileEditorManager.getInstance(project); Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(project)); VirtualFile projectDir = ProjectUtil.guessProjectDir(project); Iterable $this$forEach$iv = files; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); String it = (String)element$iv; int $i$a$-forEach-CommandLineStarterProjectContext$addRecentFiles$1 = 0;
/*     */       VirtualFile virtualFile = projectDir.findFileByRelativePath(it);
/*     */       int $i$a$-let-CommandLineStarterProjectContext$addRecentFiles$1$1 = 0;
/*     */       editorManager.openFile(virtualFile);
/*     */       editorManager.closeFile(virtualFile);
/*     */       projectDir.findFileByRelativePath(it); }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarterProjectContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */