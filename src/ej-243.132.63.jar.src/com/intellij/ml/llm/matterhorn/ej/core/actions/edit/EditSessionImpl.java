/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vcs.FilePath;
/*     */ import com.intellij.openapi.vcs.LocalFilePath;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vcs.changes.ContentRevision;
/*     */ import com.intellij.openapi.vcs.changes.SimpleContentRevision;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\b\n\002\030\002\n\002\b\002\030\000 #2\0020\001:\001#BE\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\006\020\006\032\0020\007\022\030\020\b\032\024\022\n\022\b\022\004\022\0020\n0\t\022\004\022\0020\0050\003\022\006\020\013\032\0020\f¢\006\004\b\r\020\016J(\020\023\032\004\030\0010\0242\006\020\025\032\0020\0212\006\020\026\032\0020\0272\006\020\030\032\0020\031H@¢\006\002\020\032J \020\033\032\004\030\0010\0242\006\020\025\032\0020\0212\006\020\034\032\0020\031H@¢\006\002\020\035J\016\020\036\032\0020\005H@¢\006\002\020\037J\022\020 \032\004\030\0010\n2\006\020!\032\0020\"H\002R\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R \020\b\032\024\022\n\022\b\022\004\022\0020\n0\t\022\004\022\0020\0050\003X\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\032\020\017\032\016\022\004\022\0020\021\022\004\022\0020\0220\020X\004¢\006\002\n\000¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession;", "sendEvent", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "", "project", "Lcom/intellij/openapi/project/Project;", "pushChange", "", "Lcom/intellij/openapi/vcs/changes/Change;", "humanInLoop", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/HumanInLoop;)V", "edits", "", "Ljava/nio/file/Path;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;", "requestDocumentUpdate", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditError;", "path", "document", "Lcom/intellij/openapi/editor/Document;", "updatedText", "", "(Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestDocumentCreation", "newText", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commit", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToDiff", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditValidationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditValidationService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,174:1\n1557#2:175\n1628#2,3:176\n1611#2,9:179\n1863#2:188\n1864#2:190\n1620#2:191\n1755#2,3:192\n1#3:189\n14#4:195\n*S KotlinDebug\n*F\n+ 1 EditValidationService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl\n*L\n110#1:175\n110#1:176,3\n121#1:179,9\n121#1:188\n121#1:190\n121#1:191\n141#1:192,3\n121#1:189\n34#1:195\n*E\n"})
/*     */ public final class EditSessionImpl implements EditSession {
/*     */   public EditSessionImpl(@NotNull Function1<CustomArtifactEvent, Unit> sendEvent, @NotNull Project project, @NotNull Function1<List<? extends Change>, Unit> pushChange, @NotNull HumanInLoop humanInLoop) {
/*  28 */     this.sendEvent = sendEvent;
/*  29 */     this.project = project;
/*  30 */     this.pushChange = pushChange;
/*  31 */     this.humanInLoop = humanInLoop;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     this.edits = new LinkedHashMap<>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Function1<CustomArtifactEvent, Unit> sendEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Project project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Function1<List<? extends Change>, Unit> pushChange;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final HumanInLoop humanInLoop;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Map<Path, EditInfo> edits;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static
/*     */   {
/*     */     int $i$f$logger = 0;
/* 195 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(EditSessionImpl.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(EditSessionImpl.class);
/*     */   
/*     */   @Nullable
/*     */   public Object requestDocumentUpdate(@NotNull Path path, @NotNull Document document, @NotNull String updatedText, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$requestDocumentUpdate$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$requestDocumentUpdate$1
/*     */     //   13: astore #8
/*     */     //   15: aload #8
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #8
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$requestDocumentUpdate$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #7
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #9
/*     */     //   65: aload #8
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 290, 0 -> 92, 1 -> 183
/*     */     //   92: aload #7
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_2
/*     */     //   98: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   103: aload_3
/*     */     //   104: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   107: ifeq -> 112
/*     */     //   110: aconst_null
/*     */     //   111: areturn
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface isWritable : ()Z
/*     */     //   118: ifne -> 125
/*     */     //   121: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/DocumentIsReadonlyError.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/DocumentIsReadonlyError;
/*     */     //   124: areturn
/*     */     //   125: aload_0
/*     */     //   126: getfield humanInLoop : Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   129: aload_1
/*     */     //   130: aload_2
/*     */     //   131: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   136: aload_3
/*     */     //   137: aload #8
/*     */     //   139: aload #8
/*     */     //   141: aload_0
/*     */     //   142: putfield L$0 : Ljava/lang/Object;
/*     */     //   145: aload #8
/*     */     //   147: aload_1
/*     */     //   148: putfield L$1 : Ljava/lang/Object;
/*     */     //   151: aload #8
/*     */     //   153: aload_2
/*     */     //   154: putfield L$2 : Ljava/lang/Object;
/*     */     //   157: aload #8
/*     */     //   159: aload_3
/*     */     //   160: putfield L$3 : Ljava/lang/Object;
/*     */     //   163: aload #8
/*     */     //   165: iconst_1
/*     */     //   166: putfield label : I
/*     */     //   169: invokeinterface shouldAllowEdit : (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   174: dup
/*     */     //   175: aload #9
/*     */     //   177: if_acmpne -> 226
/*     */     //   180: aload #9
/*     */     //   182: areturn
/*     */     //   183: aload #8
/*     */     //   185: getfield L$3 : Ljava/lang/Object;
/*     */     //   188: checkcast java/lang/String
/*     */     //   191: astore_3
/*     */     //   192: aload #8
/*     */     //   194: getfield L$2 : Ljava/lang/Object;
/*     */     //   197: checkcast com/intellij/openapi/editor/Document
/*     */     //   200: astore_2
/*     */     //   201: aload #8
/*     */     //   203: getfield L$1 : Ljava/lang/Object;
/*     */     //   206: checkcast java/nio/file/Path
/*     */     //   209: astore_1
/*     */     //   210: aload #8
/*     */     //   212: getfield L$0 : Ljava/lang/Object;
/*     */     //   215: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl
/*     */     //   218: astore_0
/*     */     //   219: aload #7
/*     */     //   221: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   224: aload #7
/*     */     //   226: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopResponse
/*     */     //   229: astore #5
/*     */     //   231: aload #5
/*     */     //   233: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree;
/*     */     //   236: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   239: ifeq -> 246
/*     */     //   242: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UserDeclinedEditError.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UserDeclinedEditError;
/*     */     //   245: areturn
/*     */     //   246: aload_0
/*     */     //   247: getfield edits : Ljava/util/Map;
/*     */     //   250: aload_1
/*     */     //   251: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   254: dup
/*     */     //   255: aload_2
/*     */     //   256: aload_1
/*     */     //   257: aload_3
/*     */     //   258: invokespecial <init> : (Lcom/intellij/openapi/editor/Document;Ljava/nio/file/Path;Ljava/lang/String;)V
/*     */     //   261: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   269: astore #6
/*     */     //   271: aload #6
/*     */     //   273: ifnull -> 288
/*     */     //   276: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   279: aload_1
/*     */     //   280: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   285: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   288: aconst_null
/*     */     //   289: areturn
/*     */     //   290: new java/lang/IllegalStateException
/*     */     //   293: dup
/*     */     //   294: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   296: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   299: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 63
/*     */     //   #44	-> 97
/*     */     //   #45	-> 110
/*     */     //   #47	-> 112
/*     */     //   #48	-> 121
/*     */     //   #51	-> 125
/*     */     //   #39	-> 180
/*     */     //   #52	-> 231
/*     */     //   #53	-> 242
/*     */     //   #56	-> 246
/*     */     //   #57	-> 271
/*     */     //   #58	-> 276
/*     */     //   #60	-> 288
/*     */     //   #39	-> 290
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	86	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   219	23	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   246	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   97	86	1	path	Ljava/nio/file/Path;
/*     */     //   210	32	1	path	Ljava/nio/file/Path;
/*     */     //   246	42	1	path	Ljava/nio/file/Path;
/*     */     //   97	86	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   201	41	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   246	25	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   97	86	3	updatedText	Ljava/lang/String;
/*     */     //   192	50	3	updatedText	Ljava/lang/String;
/*     */     //   246	25	3	updatedText	Ljava/lang/String;
/*     */     //   231	11	5	response	Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;
/*     */     //   271	5	6	old	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   0	300	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	237	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	230	7	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object requestDocumentCreation(@NotNull Path path, @NotNull String newText, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$requestDocumentCreation$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$requestDocumentCreation$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$requestDocumentCreation$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 244, 0 -> 88, 1 -> 140
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield humanInLoop : Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   97: aload_1
/*     */     //   98: aconst_null
/*     */     //   99: aload_2
/*     */     //   100: aload #7
/*     */     //   102: aload #7
/*     */     //   104: aload_0
/*     */     //   105: putfield L$0 : Ljava/lang/Object;
/*     */     //   108: aload #7
/*     */     //   110: aload_1
/*     */     //   111: putfield L$1 : Ljava/lang/Object;
/*     */     //   114: aload #7
/*     */     //   116: aload_2
/*     */     //   117: putfield L$2 : Ljava/lang/Object;
/*     */     //   120: aload #7
/*     */     //   122: iconst_1
/*     */     //   123: putfield label : I
/*     */     //   126: invokeinterface shouldAllowEdit : (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   131: dup
/*     */     //   132: aload #8
/*     */     //   134: if_acmpne -> 174
/*     */     //   137: aload #8
/*     */     //   139: areturn
/*     */     //   140: aload #7
/*     */     //   142: getfield L$2 : Ljava/lang/Object;
/*     */     //   145: checkcast java/lang/String
/*     */     //   148: astore_2
/*     */     //   149: aload #7
/*     */     //   151: getfield L$1 : Ljava/lang/Object;
/*     */     //   154: checkcast java/nio/file/Path
/*     */     //   157: astore_1
/*     */     //   158: aload #7
/*     */     //   160: getfield L$0 : Ljava/lang/Object;
/*     */     //   163: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl
/*     */     //   166: astore_0
/*     */     //   167: aload #6
/*     */     //   169: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   172: aload #6
/*     */     //   174: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopResponse
/*     */     //   177: astore #4
/*     */     //   179: aload #4
/*     */     //   181: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree;
/*     */     //   184: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   187: ifeq -> 194
/*     */     //   190: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UserDeclinedEditError.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UserDeclinedEditError;
/*     */     //   193: areturn
/*     */     //   194: aload_0
/*     */     //   195: getfield edits : Ljava/util/Map;
/*     */     //   198: aload_1
/*     */     //   199: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   202: dup
/*     */     //   203: aconst_null
/*     */     //   204: aload_1
/*     */     //   205: aload_2
/*     */     //   206: invokespecial <init> : (Lcom/intellij/openapi/editor/Document;Ljava/nio/file/Path;Ljava/lang/String;)V
/*     */     //   209: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   214: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   217: astore #5
/*     */     //   219: aload #5
/*     */     //   221: ifnull -> 242
/*     */     //   224: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   227: aload_1
/*     */     //   228: aload_2
/*     */     //   229: aload #5
/*     */     //   231: invokevirtual getUpdatedText : ()Ljava/lang/String;
/*     */     //   234: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   239: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   242: aconst_null
/*     */     //   243: areturn
/*     */     //   244: new java/lang/IllegalStateException
/*     */     //   247: dup
/*     */     //   248: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   250: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   253: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 60
/*     */     //   #68	-> 93
/*     */     //   #63	-> 137
/*     */     //   #69	-> 179
/*     */     //   #70	-> 190
/*     */     //   #73	-> 194
/*     */     //   #74	-> 219
/*     */     //   #75	-> 224
/*     */     //   #78	-> 242
/*     */     //   #63	-> 244
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   167	23	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   194	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   93	47	1	path	Ljava/nio/file/Path;
/*     */     //   158	32	1	path	Ljava/nio/file/Path;
/*     */     //   194	48	1	path	Ljava/nio/file/Path;
/*     */     //   93	47	2	newText	Ljava/lang/String;
/*     */     //   149	41	2	newText	Ljava/lang/String;
/*     */     //   194	48	2	newText	Ljava/lang/String;
/*     */     //   179	11	4	response	Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;
/*     */     //   219	23	5	old	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   0	254	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	194	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	187	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object commit(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$commit$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$commit$1
/*     */     //   11: astore #28
/*     */     //   13: aload #28
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #28
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl$commit$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #28
/*     */     //   50: aload #28
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #27
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #29
/*     */     //   62: aload #28
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1075, 0 -> 100, 1 -> 189, 2 -> 700, 3 -> 816, 4 -> 1059
/*     */     //   100: aload #27
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   109: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   112: astore_2
/*     */     //   113: ldc 'command.edit.name'
/*     */     //   115: iconst_0
/*     */     //   116: anewarray java/lang/Object
/*     */     //   119: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   122: astore_3
/*     */     //   123: getstatic com/intellij/history/LocalHistory.Companion : Lcom/intellij/history/LocalHistory$Companion;
/*     */     //   126: invokevirtual getInstance : ()Lcom/intellij/history/LocalHistory;
/*     */     //   129: aload_3
/*     */     //   130: invokestatic getJunieActivityId : ()Lcom/intellij/history/ActivityId;
/*     */     //   133: invokevirtual startAction : (Ljava/lang/String;Lcom/intellij/history/ActivityId;)Lcom/intellij/history/LocalHistoryAction;
/*     */     //   136: astore #4
/*     */     //   138: nop
/*     */     //   139: aload_0
/*     */     //   140: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   143: aload_3
/*     */     //   144: aload_0
/*     */     //   145: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;)Lkotlin/jvm/functions/Function0;
/*     */     //   150: aload #28
/*     */     //   152: aload #28
/*     */     //   154: aload_0
/*     */     //   155: putfield L$0 : Ljava/lang/Object;
/*     */     //   158: aload #28
/*     */     //   160: aload_2
/*     */     //   161: putfield L$1 : Ljava/lang/Object;
/*     */     //   164: aload #28
/*     */     //   166: aload #4
/*     */     //   168: putfield L$2 : Ljava/lang/Object;
/*     */     //   171: aload #28
/*     */     //   173: iconst_1
/*     */     //   174: putfield label : I
/*     */     //   177: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   180: dup
/*     */     //   181: aload #29
/*     */     //   183: if_acmpne -> 225
/*     */     //   186: aload #29
/*     */     //   188: areturn
/*     */     //   189: aload #28
/*     */     //   191: getfield L$2 : Ljava/lang/Object;
/*     */     //   194: checkcast com/intellij/history/LocalHistoryAction
/*     */     //   197: astore #4
/*     */     //   199: aload #28
/*     */     //   201: getfield L$1 : Ljava/lang/Object;
/*     */     //   204: checkcast com/intellij/psi/PsiDocumentManager
/*     */     //   207: astore_2
/*     */     //   208: aload #28
/*     */     //   210: getfield L$0 : Ljava/lang/Object;
/*     */     //   213: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl
/*     */     //   216: astore_0
/*     */     //   217: nop
/*     */     //   218: aload #27
/*     */     //   220: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   223: aload #27
/*     */     //   225: pop
/*     */     //   226: aload_0
/*     */     //   227: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl
/*     */     //   230: astore #6
/*     */     //   232: iconst_0
/*     */     //   233: istore #7
/*     */     //   235: aload #6
/*     */     //   237: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   240: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   243: dup
/*     */     //   244: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   247: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   250: dup
/*     */     //   251: ldc_w 'toNioPath(...)'
/*     */     //   254: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   257: astore #8
/*     */     //   259: aload #6
/*     */     //   261: getfield edits : Ljava/util/Map;
/*     */     //   264: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   269: checkcast java/lang/Iterable
/*     */     //   272: astore #9
/*     */     //   274: iconst_0
/*     */     //   275: istore #10
/*     */     //   277: aload #9
/*     */     //   279: astore #11
/*     */     //   281: new java/util/ArrayList
/*     */     //   284: dup
/*     */     //   285: aload #9
/*     */     //   287: bipush #10
/*     */     //   289: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   292: invokespecial <init> : (I)V
/*     */     //   295: checkcast java/util/Collection
/*     */     //   298: astore #12
/*     */     //   300: iconst_0
/*     */     //   301: istore #13
/*     */     //   303: aload #11
/*     */     //   305: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   310: astore #14
/*     */     //   312: aload #14
/*     */     //   314: invokeinterface hasNext : ()Z
/*     */     //   319: ifeq -> 435
/*     */     //   322: aload #14
/*     */     //   324: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   329: astore #15
/*     */     //   331: aload #12
/*     */     //   333: aload #15
/*     */     //   335: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   338: astore #16
/*     */     //   340: astore #17
/*     */     //   342: iconst_0
/*     */     //   343: istore #18
/*     */     //   345: aload #8
/*     */     //   347: aload #16
/*     */     //   349: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   352: invokeinterface relativize : (Ljava/nio/file/Path;)Ljava/nio/file/Path;
/*     */     //   357: astore #19
/*     */     //   359: aload #16
/*     */     //   361: invokevirtual getCreatedDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   364: ifnull -> 390
/*     */     //   367: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange
/*     */     //   370: dup
/*     */     //   371: aload #19
/*     */     //   373: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   376: aload #19
/*     */     //   378: aconst_null
/*     */     //   379: aload #16
/*     */     //   381: invokevirtual getUpdatedText : ()Ljava/lang/String;
/*     */     //   384: invokespecial <init> : (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   387: goto -> 422
/*     */     //   390: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange
/*     */     //   393: dup
/*     */     //   394: aload #19
/*     */     //   396: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   399: aload #19
/*     */     //   401: aload #16
/*     */     //   403: invokevirtual getInitialContent : ()Ljava/lang/String;
/*     */     //   406: dup
/*     */     //   407: ifnonnull -> 414
/*     */     //   410: pop
/*     */     //   411: ldc_w ''
/*     */     //   414: aload #16
/*     */     //   416: invokevirtual getUpdatedText : ()Ljava/lang/String;
/*     */     //   419: invokespecial <init> : (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   422: nop
/*     */     //   423: aload #17
/*     */     //   425: swap
/*     */     //   426: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   431: pop
/*     */     //   432: goto -> 312
/*     */     //   435: aload #12
/*     */     //   437: checkcast java/util/List
/*     */     //   440: nop
/*     */     //   441: astore #20
/*     */     //   443: aload #6
/*     */     //   445: getfield sendEvent : Lkotlin/jvm/functions/Function1;
/*     */     //   448: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditEvent
/*     */     //   451: dup
/*     */     //   452: aload #20
/*     */     //   454: invokespecial <init> : (Ljava/util/List;)V
/*     */     //   457: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   462: pop
/*     */     //   463: aload #20
/*     */     //   465: checkcast java/lang/Iterable
/*     */     //   468: astore #10
/*     */     //   470: iconst_0
/*     */     //   471: istore #11
/*     */     //   473: aload #10
/*     */     //   475: astore #12
/*     */     //   477: new java/util/ArrayList
/*     */     //   480: dup
/*     */     //   481: invokespecial <init> : ()V
/*     */     //   484: checkcast java/util/Collection
/*     */     //   487: astore #13
/*     */     //   489: iconst_0
/*     */     //   490: istore #14
/*     */     //   492: aload #12
/*     */     //   494: astore #15
/*     */     //   496: iconst_0
/*     */     //   497: istore #16
/*     */     //   499: aload #15
/*     */     //   501: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   506: astore #18
/*     */     //   508: aload #18
/*     */     //   510: invokeinterface hasNext : ()Z
/*     */     //   515: ifeq -> 577
/*     */     //   518: aload #18
/*     */     //   520: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   525: astore #19
/*     */     //   527: aload #19
/*     */     //   529: astore #21
/*     */     //   531: iconst_0
/*     */     //   532: istore #22
/*     */     //   534: aload #21
/*     */     //   536: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange
/*     */     //   539: astore #23
/*     */     //   541: iconst_0
/*     */     //   542: istore #24
/*     */     //   544: aload #6
/*     */     //   546: aload #23
/*     */     //   548: invokespecial convertToDiff : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;)Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   551: dup
/*     */     //   552: ifnull -> 573
/*     */     //   555: astore #25
/*     */     //   557: iconst_0
/*     */     //   558: istore #26
/*     */     //   560: aload #13
/*     */     //   562: aload #25
/*     */     //   564: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   569: pop
/*     */     //   570: goto -> 574
/*     */     //   573: pop
/*     */     //   574: goto -> 508
/*     */     //   577: nop
/*     */     //   578: aload #13
/*     */     //   580: checkcast java/util/List
/*     */     //   583: nop
/*     */     //   584: astore #9
/*     */     //   586: aload #6
/*     */     //   588: getfield pushChange : Lkotlin/jvm/functions/Function1;
/*     */     //   591: aload #9
/*     */     //   593: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   598: pop
/*     */     //   599: nop
/*     */     //   600: nop
/*     */     //   601: aload_0
/*     */     //   602: getfield edits : Ljava/util/Map;
/*     */     //   605: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   610: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   615: astore #5
/*     */     //   617: aload #5
/*     */     //   619: invokeinterface hasNext : ()Z
/*     */     //   624: ifeq -> 866
/*     */     //   627: aload #5
/*     */     //   629: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   634: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   637: astore #6
/*     */     //   639: aload #6
/*     */     //   641: aload_2
/*     */     //   642: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;Lcom/intellij/psi/PsiDocumentManager;)Lkotlin/jvm/functions/Function0;
/*     */     //   647: aload #28
/*     */     //   649: aload #28
/*     */     //   651: aload_0
/*     */     //   652: putfield L$0 : Ljava/lang/Object;
/*     */     //   655: aload #28
/*     */     //   657: aload_2
/*     */     //   658: putfield L$1 : Ljava/lang/Object;
/*     */     //   661: aload #28
/*     */     //   663: aload #4
/*     */     //   665: putfield L$2 : Ljava/lang/Object;
/*     */     //   668: aload #28
/*     */     //   670: aload #5
/*     */     //   672: putfield L$3 : Ljava/lang/Object;
/*     */     //   675: aload #28
/*     */     //   677: aload #6
/*     */     //   679: putfield L$4 : Ljava/lang/Object;
/*     */     //   682: aload #28
/*     */     //   684: iconst_2
/*     */     //   685: putfield label : I
/*     */     //   688: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   691: dup
/*     */     //   692: aload #29
/*     */     //   694: if_acmpne -> 756
/*     */     //   697: aload #29
/*     */     //   699: areturn
/*     */     //   700: aload #28
/*     */     //   702: getfield L$4 : Ljava/lang/Object;
/*     */     //   705: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   708: astore #6
/*     */     //   710: aload #28
/*     */     //   712: getfield L$3 : Ljava/lang/Object;
/*     */     //   715: checkcast java/util/Iterator
/*     */     //   718: astore #5
/*     */     //   720: aload #28
/*     */     //   722: getfield L$2 : Ljava/lang/Object;
/*     */     //   725: checkcast com/intellij/history/LocalHistoryAction
/*     */     //   728: astore #4
/*     */     //   730: aload #28
/*     */     //   732: getfield L$1 : Ljava/lang/Object;
/*     */     //   735: checkcast com/intellij/psi/PsiDocumentManager
/*     */     //   738: astore_2
/*     */     //   739: aload #28
/*     */     //   741: getfield L$0 : Ljava/lang/Object;
/*     */     //   744: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl
/*     */     //   747: astore_0
/*     */     //   748: nop
/*     */     //   749: aload #27
/*     */     //   751: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   754: aload #27
/*     */     //   756: pop
/*     */     //   757: aload #6
/*     */     //   759: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;)Lkotlin/jvm/functions/Function0;
/*     */     //   764: aload #28
/*     */     //   766: aload #28
/*     */     //   768: aload_0
/*     */     //   769: putfield L$0 : Ljava/lang/Object;
/*     */     //   772: aload #28
/*     */     //   774: aload_2
/*     */     //   775: putfield L$1 : Ljava/lang/Object;
/*     */     //   778: aload #28
/*     */     //   780: aload #4
/*     */     //   782: putfield L$2 : Ljava/lang/Object;
/*     */     //   785: aload #28
/*     */     //   787: aload #5
/*     */     //   789: putfield L$3 : Ljava/lang/Object;
/*     */     //   792: aload #28
/*     */     //   794: aconst_null
/*     */     //   795: putfield L$4 : Ljava/lang/Object;
/*     */     //   798: aload #28
/*     */     //   800: iconst_3
/*     */     //   801: putfield label : I
/*     */     //   804: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   807: dup
/*     */     //   808: aload #29
/*     */     //   810: if_acmpne -> 862
/*     */     //   813: aload #29
/*     */     //   815: areturn
/*     */     //   816: aload #28
/*     */     //   818: getfield L$3 : Ljava/lang/Object;
/*     */     //   821: checkcast java/util/Iterator
/*     */     //   824: astore #5
/*     */     //   826: aload #28
/*     */     //   828: getfield L$2 : Ljava/lang/Object;
/*     */     //   831: checkcast com/intellij/history/LocalHistoryAction
/*     */     //   834: astore #4
/*     */     //   836: aload #28
/*     */     //   838: getfield L$1 : Ljava/lang/Object;
/*     */     //   841: checkcast com/intellij/psi/PsiDocumentManager
/*     */     //   844: astore_2
/*     */     //   845: aload #28
/*     */     //   847: getfield L$0 : Ljava/lang/Object;
/*     */     //   850: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl
/*     */     //   853: astore_0
/*     */     //   854: nop
/*     */     //   855: aload #27
/*     */     //   857: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   860: aload #27
/*     */     //   862: pop
/*     */     //   863: goto -> 617
/*     */     //   866: aload #4
/*     */     //   868: invokeinterface finish : ()V
/*     */     //   873: goto -> 888
/*     */     //   876: astore #5
/*     */     //   878: aload #4
/*     */     //   880: invokeinterface finish : ()V
/*     */     //   885: aload #5
/*     */     //   887: athrow
/*     */     //   888: aload_0
/*     */     //   889: getfield edits : Ljava/util/Map;
/*     */     //   892: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   897: checkcast java/lang/Iterable
/*     */     //   900: astore #5
/*     */     //   902: iconst_0
/*     */     //   903: istore #6
/*     */     //   905: aload #5
/*     */     //   907: instanceof java/util/Collection
/*     */     //   910: ifeq -> 930
/*     */     //   913: aload #5
/*     */     //   915: checkcast java/util/Collection
/*     */     //   918: invokeinterface isEmpty : ()Z
/*     */     //   923: ifeq -> 930
/*     */     //   926: iconst_0
/*     */     //   927: goto -> 1005
/*     */     //   930: aload #5
/*     */     //   932: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   937: astore #7
/*     */     //   939: aload #7
/*     */     //   941: invokeinterface hasNext : ()Z
/*     */     //   946: ifeq -> 1004
/*     */     //   949: aload #7
/*     */     //   951: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   956: astore #8
/*     */     //   958: aload #8
/*     */     //   960: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   963: astore #9
/*     */     //   965: iconst_0
/*     */     //   966: istore #10
/*     */     //   968: getstatic com/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils;
/*     */     //   971: aload_0
/*     */     //   972: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   975: aload #9
/*     */     //   977: invokevirtual getCreatedDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   980: dup
/*     */     //   981: ifnonnull -> 994
/*     */     //   984: pop
/*     */     //   985: aload #9
/*     */     //   987: invokevirtual getExistingDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   990: dup
/*     */     //   991: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   994: invokevirtual shouldWait : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;)Z
/*     */     //   997: ifeq -> 939
/*     */     //   1000: iconst_1
/*     */     //   1001: goto -> 1005
/*     */     //   1004: iconst_0
/*     */     //   1005: ifeq -> 1071
/*     */     //   1008: getstatic com/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/utils/AwaitUtils;
/*     */     //   1011: aload_0
/*     */     //   1012: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   1015: aload #28
/*     */     //   1017: aload #28
/*     */     //   1019: aconst_null
/*     */     //   1020: putfield L$0 : Ljava/lang/Object;
/*     */     //   1023: aload #28
/*     */     //   1025: aconst_null
/*     */     //   1026: putfield L$1 : Ljava/lang/Object;
/*     */     //   1029: aload #28
/*     */     //   1031: aconst_null
/*     */     //   1032: putfield L$2 : Ljava/lang/Object;
/*     */     //   1035: aload #28
/*     */     //   1037: aconst_null
/*     */     //   1038: putfield L$3 : Ljava/lang/Object;
/*     */     //   1041: aload #28
/*     */     //   1043: iconst_4
/*     */     //   1044: putfield label : I
/*     */     //   1047: invokevirtual awaitProjectUpdate : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1050: dup
/*     */     //   1051: aload #29
/*     */     //   1053: if_acmpne -> 1066
/*     */     //   1056: aload #29
/*     */     //   1058: areturn
/*     */     //   1059: aload #27
/*     */     //   1061: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1064: aload #27
/*     */     //   1066: pop
/*     */     //   1067: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1070: areturn
/*     */     //   1071: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1074: areturn
/*     */     //   1075: new java/lang/IllegalStateException
/*     */     //   1078: dup
/*     */     //   1079: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1081: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1084: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #81	-> 60
/*     */     //   #83	-> 105
/*     */     //   #84	-> 113
/*     */     //   #85	-> 123
/*     */     //   #86	-> 138
/*     */     //   #87	-> 139
/*     */     //   #81	-> 186
/*     */     //   #108	-> 225
/*     */     //   #109	-> 235
/*     */     //   #110	-> 259
/*     */     //   #175	-> 277
/*     */     //   #176	-> 303
/*     */     //   #177	-> 331
/*     */     //   #111	-> 345
/*     */     //   #113	-> 359
/*     */     //   #114	-> 367
/*     */     //   #117	-> 390
/*     */     //   #118	-> 422
/*     */     //   #177	-> 426
/*     */     //   #178	-> 435
/*     */     //   #175	-> 440
/*     */     //   #110	-> 441
/*     */     //   #120	-> 443
/*     */     //   #121	-> 463
/*     */     //   #179	-> 473
/*     */     //   #187	-> 492
/*     */     //   #188	-> 499
/*     */     //   #187	-> 534
/*     */     //   #121	-> 544
/*     */     //   #187	-> 551
/*     */     //   #189	-> 557
/*     */     //   #187	-> 560
/*     */     //   #187	-> 570
/*     */     //   #187	-> 573
/*     */     //   #188	-> 574
/*     */     //   #190	-> 577
/*     */     //   #191	-> 578
/*     */     //   #179	-> 583
/*     */     //   #121	-> 584
/*     */     //   #122	-> 586
/*     */     //   #123	-> 599
/*     */     //   #108	-> 600
/*     */     //   #125	-> 601
/*     */     //   #127	-> 639
/*     */     //   #81	-> 697
/*     */     //   #132	-> 756
/*     */     //   #81	-> 813
/*     */     //   #132	-> 862
/*     */     //   #138	-> 866
/*     */     //   #139	-> 873
/*     */     //   #138	-> 876
/*     */     //   #141	-> 888
/*     */     //   #192	-> 905
/*     */     //   #193	-> 930
/*     */     //   #141	-> 968
/*     */     //   #193	-> 997
/*     */     //   #194	-> 1004
/*     */     //   #141	-> 1005
/*     */     //   #142	-> 1008
/*     */     //   #81	-> 1056
/*     */     //   #144	-> 1066
/*     */     //   #81	-> 1075
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	84	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   217	383	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   600	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   601	99	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   748	68	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   854	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   888	42	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   930	67	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   997	7	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   1004	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   1005	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   113	76	2	psiDocumentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   208	392	2	psiDocumentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   600	1	2	psiDocumentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   601	99	2	psiDocumentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   739	77	2	psiDocumentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   845	21	2	psiDocumentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   123	57	3	commandName	Ljava/lang/String;
/*     */     //   138	51	4	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   199	401	4	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   600	1	4	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   601	99	4	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   730	86	4	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   836	37	4	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   876	9	4	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   902	28	5	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   930	9	5	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   232	368	6	$this$commit_u24lambda_u244	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */     //   639	61	6	edit	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   710	97	6	edit	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   259	176	8	projectPath	Ljava/nio/file/Path;
/*     */     //   958	7	8	element$iv	Ljava/lang/Object;
/*     */     //   274	26	9	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   586	14	9	diffs	Ljava/util/List;
/*     */     //   965	19	9	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   984	10	9	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   470	19	10	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   300	12	11	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   300	137	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   489	7	12	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   489	91	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   331	11	15	item$iv$iv	Ljava/lang/Object;
/*     */     //   496	12	15	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   342	48	16	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   390	32	16	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   359	31	19	path	Ljava/nio/file/Path;
/*     */     //   390	20	19	path	Ljava/nio/file/Path;
/*     */     //   527	4	19	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   443	27	20	changes	Ljava/util/List;
/*     */     //   531	43	21	element$iv$iv	Ljava/lang/Object;
/*     */     //   541	10	23	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;
/*     */     //   557	13	25	it$iv$iv	Ljava/lang/Object;
/*     */     //   345	78	18	$i$a$-map-EditSessionImpl$commit$3$changes$1	I
/*     */     //   303	134	13	$i$f$mapTo	I
/*     */     //   277	164	10	$i$f$map	I
/*     */     //   544	7	24	$i$a$-mapNotNull-EditSessionImpl$commit$3$diffs$1	I
/*     */     //   560	10	26	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   534	40	22	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   499	79	16	$i$f$forEach	I
/*     */     //   492	88	14	$i$f$mapNotNullTo	I
/*     */     //   473	111	11	$i$f$mapNotNull	I
/*     */     //   235	365	7	$i$a$-run-EditSessionImpl$commit$3	I
/*     */     //   968	29	10	$i$a$-any-EditSessionImpl$commit$6	I
/*     */     //   905	100	6	$i$f$any	I
/*     */     //   0	1085	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1025	28	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1018	27	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   138	180	876	finally
/*     */     //   217	691	876	finally
/*     */     //   748	807	876	finally
/*     */     //   854	866	876	finally
/*     */     //   876	878	876	finally
/*     */   }
/*     */   
/*     */   private static final Unit commit$lambda$1(EditSessionImpl this$0) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield edits : Ljava/util/Map;
/*     */     //   4: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   9: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   14: astore_1
/*     */     //   15: aload_1
/*     */     //   16: invokeinterface hasNext : ()Z
/*     */     //   21: ifeq -> 210
/*     */     //   24: aload_1
/*     */     //   25: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   30: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo
/*     */     //   33: astore_2
/*     */     //   34: aload_2
/*     */     //   35: invokevirtual getExistingDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   38: ifnonnull -> 181
/*     */     //   41: aload_2
/*     */     //   42: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   45: invokeinterface getParent : ()Ljava/nio/file/Path;
/*     */     //   50: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   53: invokestatic createDirectoryIfMissing : (Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   56: dup
/*     */     //   57: ifnull -> 114
/*     */     //   60: astore #5
/*     */     //   62: iconst_0
/*     */     //   63: istore #6
/*     */     //   65: aload_2
/*     */     //   66: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   69: invokeinterface toFile : ()Ljava/io/File;
/*     */     //   74: iconst_1
/*     */     //   75: invokestatic findFileByIoFile : (Ljava/io/File;Z)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   78: dup
/*     */     //   79: ifnonnull -> 108
/*     */     //   82: pop
/*     */     //   83: aload #5
/*     */     //   85: aload_0
/*     */     //   86: aload_2
/*     */     //   87: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   90: invokeinterface getFileName : ()Ljava/nio/file/Path;
/*     */     //   95: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   98: invokevirtual createChildData : (Ljava/lang/Object;Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   101: dup
/*     */     //   102: ldc_w 'createChildData(...)'
/*     */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   108: nop
/*     */     //   109: nop
/*     */     //   110: dup
/*     */     //   111: ifnonnull -> 135
/*     */     //   114: pop
/*     */     //   115: new java/lang/IllegalStateException
/*     */     //   118: dup
/*     */     //   119: aload_2
/*     */     //   120: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   123: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   128: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   131: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   134: athrow
/*     */     //   135: astore #4
/*     */     //   137: aload_2
/*     */     //   138: invokestatic getInstance : ()Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */     //   141: aload #4
/*     */     //   143: invokevirtual getDocument : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/Document;
/*     */     //   146: dup
/*     */     //   147: ifnonnull -> 171
/*     */     //   150: pop
/*     */     //   151: new java/lang/IllegalStateException
/*     */     //   154: dup
/*     */     //   155: aload_2
/*     */     //   156: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   159: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   164: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   167: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   170: athrow
/*     */     //   171: invokevirtual setCreatedDocument : (Lcom/intellij/openapi/editor/Document;)V
/*     */     //   174: aload_2
/*     */     //   175: invokevirtual getCreatedDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   178: goto -> 185
/*     */     //   181: aload_2
/*     */     //   182: invokevirtual getExistingDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   185: astore_3
/*     */     //   186: aload_3
/*     */     //   187: dup
/*     */     //   188: ifnull -> 206
/*     */     //   191: aload_2
/*     */     //   192: invokevirtual getUpdatedText : ()Ljava/lang/String;
/*     */     //   195: checkcast java/lang/CharSequence
/*     */     //   198: invokeinterface setText : (Ljava/lang/CharSequence;)V
/*     */     //   203: goto -> 15
/*     */     //   206: pop
/*     */     //   207: goto -> 15
/*     */     //   210: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   213: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #88	-> 0
/*     */     //   #89	-> 34
/*     */     //   #90	-> 38
/*     */     //   #91	-> 41
/*     */     //   #92	-> 65
/*     */     //   #93	-> 85
/*     */     //   #94	-> 86
/*     */     //   #92	-> 98
/*     */     //   #95	-> 108
/*     */     //   #91	-> 109
/*     */     //   #91	-> 110
/*     */     //   #96	-> 119
/*     */     //   #91	-> 135
/*     */     //   #98	-> 137
/*     */     //   #99	-> 155
/*     */     //   #98	-> 171
/*     */     //   #100	-> 174
/*     */     //   #102	-> 181
/*     */     //   #89	-> 185
/*     */     //   #104	-> 186
/*     */     //   #106	-> 210
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   65	44	6	$i$a$-let-EditSessionImpl$commit$2$document$virtualFile$1	I
/*     */     //   62	47	5	parentDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   137	41	4	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   186	21	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   34	173	2	edit	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditInfo;
/*     */     //   0	214	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSessionImpl;
/*     */   }
/*     */   
/*     */   private static final Unit commit$lambda$5(EditInfo $edit, PsiDocumentManager $psiDocumentManager) {
/*     */     Document document = $edit.getEffectiveDocument();
/*     */     $psiDocumentManager.commitDocument(document);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit commit$lambda$6(EditInfo $edit) {
/*     */     Document document = $edit.getEffectiveDocument();
/*     */     FileDocumentManager.getInstance().saveDocument(document);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Change convertToDiff(FileChange change) {
/*     */     SimpleContentRevision before = (change.getInitialContent() == null) ? null : new SimpleContentRevision(change.getInitialContent(), (FilePath)new LocalFilePath(change.getPath().toString(), false), "Before");
/*     */     return new Change((ContentRevision)before, (ContentRevision)new SimpleContentRevision(change.getNewContent(), (FilePath)new LocalFilePath(change.getPath().toString(), false), "After"));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditValidationService.kt", l = {87, 127, 132, 142}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"}, n = {"this", "psiDocumentManager", "localHistoryAction", "this", "psiDocumentManager", "localHistoryAction", "edit", "this", "psiDocumentManager", "localHistoryAction"}, m = "commit", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSessionImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSessionImpl$commit$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     EditSessionImpl$commit$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSessionImpl.this.commit((Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditValidationService.kt", l = {68}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "path", "newText"}, m = "requestDocumentCreation", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSessionImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSessionImpl$requestDocumentCreation$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     EditSessionImpl$requestDocumentCreation$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSessionImpl.this.requestDocumentCreation(null, null, (Continuation<? super EditError>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditValidationService.kt", l = {51}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "path", "document", "updatedText"}, m = "requestDocumentUpdate", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSessionImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditSessionImpl$requestDocumentUpdate$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     EditSessionImpl$requestDocumentUpdate$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditSessionImpl.this.requestDocumentUpdate(null, null, null, (Continuation<? super EditError>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSessionImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */