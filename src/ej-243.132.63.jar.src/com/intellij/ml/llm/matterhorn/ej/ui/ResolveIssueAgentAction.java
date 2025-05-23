/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.Artifact;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ElectricJuniorSupport;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.JuniePluginLLMProxyProvider;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.actionSystem.CommonDataKeys;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.impl.DocumentImpl;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.registry.Registry;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0072\006\020\b\032\0020\tH\026J\020\020\013\032\0020\f2\006\020\r\032\0020\016H\002¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/ResolveIssueAgentAction;", "Lcom/intellij/openapi/actionSystem/AnAction;", "<init>", "()V", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "actionPerformed", "isTicketDescriptionFile", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ResolveIssueAgentAction
/*     */   extends AnAction
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public ActionUpdateThread getActionUpdateThread() {
/*  51 */     return ActionUpdateThread.BGT;
/*     */   }
/*     */   public void update(@NotNull AnActionEvent e) {
/*  54 */     Intrinsics.checkNotNullParameter(e, "e"); Project project = e.getProject();
/*     */     
/*  56 */     if (project == null) {
/*  57 */       e.getPresentation().setEnabledAndVisible(false);
/*     */       
/*     */       return;
/*     */     } 
/*  61 */     if (Registry.Companion.is("matterhorn.artifact.debug.ui", false)) {
/*  62 */       e.getPresentation().setEnabledAndVisible(false);
/*     */       
/*     */       return;
/*     */     } 
/*  66 */     VirtualFile file = (VirtualFile)e.getDataContext().getData(CommonDataKeys.VIRTUAL_FILE);
/*  67 */     e.getPresentation().setEnabledAndVisible((file != null && isTicketDescriptionFile(file)));
/*     */   } public void actionPerformed(@NotNull AnActionEvent e) {
/*     */     Project project;
/*     */     VirtualFile file;
/*  71 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getProject() == null) { e.getProject(); return; }
/*  72 */      if ((VirtualFile)e.getDataContext().getData(CommonDataKeys.VIRTUAL_FILE) == null) { (VirtualFile)e.getDataContext().getData(CommonDataKeys.VIRTUAL_FILE); return; }
/*  73 */      if (VirtualFileUtil.findDocument(file) == null) VirtualFileUtil.findDocument(file);  Document document = (Document)new DocumentImpl(VirtualFileUtil.readText(file));
/*     */     
/*  75 */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(project), null, null, new ResolveIssueAgentAction$actionPerformed$1(file, project, document, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ResolveIssueAgentAction.kt", l = {80, 87}, i = {0}, s = {"L$0"}, n = {"path"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.ResolveIssueAgentAction$actionPerformed$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nResolveIssueAgentAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResolveIssueAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ResolveIssueAgentAction$actionPerformed$1\n+ 2 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n*L\n1#1,197:1\n117#2:198\n*S KotlinDebug\n*F\n+ 1 ResolveIssueAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/ResolveIssueAgentAction$actionPerformed$1\n*L\n85#1:198\n*E\n"})
/*     */   static final class ResolveIssueAgentAction$actionPerformed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     ResolveIssueAgentAction$actionPerformed$1(VirtualFile $file, Project $project, Document $document, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #21
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 347, 0 -> 36, 1 -> 117, 2 -> 337
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield $file : Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   44: aload_0
/*     */       //   45: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   48: invokestatic relativeName : (Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/openapi/project/Project;)Ljava/lang/String;
/*     */       //   51: astore_2
/*     */       //   52: aload_2
/*     */       //   53: aload_0
/*     */       //   54: getfield $document : Lcom/intellij/openapi/editor/Document;
/*     */       //   57: invokeinterface getText : ()Ljava/lang/String;
/*     */       //   62: dup
/*     */       //   63: ldc 'getText(...)'
/*     */       //   65: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   68: astore #9
/*     */       //   70: astore #8
/*     */       //   72: getstatic com/intellij/ml/llm/matterhorn/ej/core/EditorContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */       //   75: aload_0
/*     */       //   76: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   79: aload_0
/*     */       //   80: checkcast kotlin/coroutines/Continuation
/*     */       //   83: aload_0
/*     */       //   84: aload_2
/*     */       //   85: putfield L$0 : Ljava/lang/Object;
/*     */       //   88: aload_0
/*     */       //   89: aload #8
/*     */       //   91: putfield L$1 : Ljava/lang/Object;
/*     */       //   94: aload_0
/*     */       //   95: aload #9
/*     */       //   97: putfield L$2 : Ljava/lang/Object;
/*     */       //   100: aload_0
/*     */       //   101: iconst_1
/*     */       //   102: putfield label : I
/*     */       //   105: invokevirtual collectEditorContext : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   108: dup
/*     */       //   109: aload #21
/*     */       //   111: if_acmpne -> 148
/*     */       //   114: aload #21
/*     */       //   116: areturn
/*     */       //   117: aload_0
/*     */       //   118: getfield L$2 : Ljava/lang/Object;
/*     */       //   121: checkcast java/lang/String
/*     */       //   124: astore #9
/*     */       //   126: aload_0
/*     */       //   127: getfield L$1 : Ljava/lang/Object;
/*     */       //   130: checkcast java/lang/String
/*     */       //   133: astore #8
/*     */       //   135: aload_0
/*     */       //   136: getfield L$0 : Ljava/lang/Object;
/*     */       //   139: checkcast java/lang/String
/*     */       //   142: astore_2
/*     */       //   143: aload_1
/*     */       //   144: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   147: aload_1
/*     */       //   148: astore #10
/*     */       //   150: aload #8
/*     */       //   152: aload #9
/*     */       //   154: aload #10
/*     */       //   156: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext
/*     */       //   159: aconst_null
/*     */       //   160: aconst_null
/*     */       //   161: aconst_null
/*     */       //   162: aconst_null
/*     */       //   163: aconst_null
/*     */       //   164: sipush #232
/*     */       //   167: aconst_null
/*     */       //   168: astore #11
/*     */       //   170: istore #12
/*     */       //   172: astore #13
/*     */       //   174: astore #14
/*     */       //   176: astore #15
/*     */       //   178: astore #16
/*     */       //   180: astore #17
/*     */       //   182: astore #18
/*     */       //   184: astore #19
/*     */       //   186: astore #20
/*     */       //   188: new com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */       //   191: dup
/*     */       //   192: aload #20
/*     */       //   194: aload #19
/*     */       //   196: aload #18
/*     */       //   198: aload #17
/*     */       //   200: aload #16
/*     */       //   202: aload #15
/*     */       //   204: aload #14
/*     */       //   206: aload #13
/*     */       //   208: iload #12
/*     */       //   210: aload #11
/*     */       //   212: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   215: astore_3
/*     */       //   216: getstatic com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider$Companion;
/*     */       //   219: aload_0
/*     */       //   220: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   223: invokevirtual getSupport : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
/*     */       //   226: astore #4
/*     */       //   228: new com/intellij/ml/llm/matterhorn/ArtifactId
/*     */       //   231: dup
/*     */       //   232: aload_2
/*     */       //   233: aload #4
/*     */       //   235: getstatic com/intellij/ml/llm/matterhorn/ej/core/IssueType.ISSUE : Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
/*     */       //   238: invokeinterface getIssueWorker : (Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;)Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */       //   243: invokevirtual getSingleStepArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */       //   246: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)V
/*     */       //   249: astore #6
/*     */       //   251: iconst_0
/*     */       //   252: istore #7
/*     */       //   254: new com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */       //   257: dup
/*     */       //   258: aload #6
/*     */       //   260: aload_3
/*     */       //   261: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentIssue.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion;
/*     */       //   264: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   267: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V
/*     */       //   270: astore #5
/*     */       //   272: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */       //   275: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */       //   278: new com/intellij/ml/llm/matterhorn/ej/ui/ResolveIssueAgentAction$actionPerformed$1$1
/*     */       //   281: dup
/*     */       //   282: aload #4
/*     */       //   284: aload_0
/*     */       //   285: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   288: aload #5
/*     */       //   290: aload_0
/*     */       //   291: getfield $file : Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   294: aconst_null
/*     */       //   295: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)V
/*     */       //   298: checkcast kotlin/jvm/functions/Function2
/*     */       //   301: aload_0
/*     */       //   302: checkcast kotlin/coroutines/Continuation
/*     */       //   305: aload_0
/*     */       //   306: aconst_null
/*     */       //   307: putfield L$0 : Ljava/lang/Object;
/*     */       //   310: aload_0
/*     */       //   311: aconst_null
/*     */       //   312: putfield L$1 : Ljava/lang/Object;
/*     */       //   315: aload_0
/*     */       //   316: aconst_null
/*     */       //   317: putfield L$2 : Ljava/lang/Object;
/*     */       //   320: aload_0
/*     */       //   321: iconst_2
/*     */       //   322: putfield label : I
/*     */       //   325: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   328: dup
/*     */       //   329: aload #21
/*     */       //   331: if_acmpne -> 342
/*     */       //   334: aload #21
/*     */       //   336: areturn
/*     */       //   337: aload_1
/*     */       //   338: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   341: aload_1
/*     */       //   342: pop
/*     */       //   343: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   346: areturn
/*     */       //   347: new java/lang/IllegalStateException
/*     */       //   350: dup
/*     */       //   351: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   353: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   356: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #75	-> 3
/*     */       //   #76	-> 40
/*     */       //   #77	-> 52
/*     */       //   #78	-> 52
/*     */       //   #79	-> 53
/*     */       //   #80	-> 72
/*     */       //   #75	-> 114
/*     */       //   #77	-> 159
/*     */       //   #81	-> 160
/*     */       //   #77	-> 161
/*     */       //   #83	-> 216
/*     */       //   #85	-> 228
/*     */       //   #198	-> 254
/*     */       //   #85	-> 270
/*     */       //   #84	-> 270
/*     */       //   #87	-> 272
/*     */       //   #75	-> 334
/*     */       //   #99	-> 342
/*     */       //   #75	-> 347
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   52	65	2	path	Ljava/lang/String;
/*     */       //   143	108	2	path	Ljava/lang/String;
/*     */       //   216	54	3	issue	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */       //   228	42	4	ejSupport	Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
/*     */       //   270	58	4	ejSupport	Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
/*     */       //   272	56	5	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */       //   251	19	6	artifact$iv	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */       //   254	16	7	$i$f$artifactRequest	I
/*     */       //   0	357	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/ResolveIssueAgentAction$actionPerformed$1;
/*     */       //   40	307	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ResolveIssueAgentAction$actionPerformed$1> $completion) {
/*     */       return (Continuation<Unit>)new ResolveIssueAgentAction$actionPerformed$1(this.$file, this.$project, this.$document, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ResolveIssueAgentAction$actionPerformed$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   
/*     */   private final boolean isTicketDescriptionFile(VirtualFile file) {
/* 104 */     Intrinsics.checkNotNullExpressionValue(file.getName(), "getName(...)"); Intrinsics.checkNotNullExpressionValue(file.getName(), "getName(...)"); return (Intrinsics.areEqual(file.getExtension(), "md") && (StringsKt.contains(file.getName(), "ticket", true) || StringsKt.contains(file.getName(), "issue", true)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\ResolveIssueAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */