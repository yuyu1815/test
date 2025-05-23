/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.openapi.vfs.VfsUtil;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007¢\006\004\b\004\020\005J$\020\016\032\b\022\004\022\0020\0030\0172\006\020\020\032\0020\0022\006\020\021\032\0020\022H@¢\006\002\020\023R\016\020\006\032\0020\007XD¢\006\002\n\000R\016\020\b\032\0020\tXD¢\006\002\n\000R\016\020\n\032\0020\tXD¢\006\002\n\000R\016\020\013\032\0020\tXD¢\006\002\n\000R\016\020\f\032\0020\tXD¢\006\002\n\000R\016\020\r\032\0020\tXD¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrInput;", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrResponse;", "<init>", "()V", "agentName", "", "maxFiles", "", "maxDirectories", "maxDepth", "nodeLimit", "maxOnePathLen", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectStrWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,222:1\n1755#2,3:223\n1#3:226\n*S KotlinDebug\n*F\n+ 1 ProjectStrWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker\n*L\n168#1:223,3\n*E\n"})
/*     */ public final class ProjectStrWorker
/*     */   implements ArtifactRequestExecutor<ProjectStrInput, ProjectStrResponse>
/*     */ {
/*     */   @NotNull
/* 125 */   private final String agentName = "project_str_worker";
/*     */   
/* 127 */   private final int maxFiles = 150;
/* 128 */   private final int maxDirectories = 100;
/* 129 */   private final int maxDepth = 4;
/* 130 */   private final int nodeLimit = 20000;
/* 131 */   private final int maxOnePathLen = 200;
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull ProjectStrInput input, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker$produceArtifact$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker$produceArtifact$1
/*     */     //   11: astore #16
/*     */     //   13: aload #16
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #16
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker$produceArtifact$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #16
/*     */     //   50: aload #16
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #15
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #17
/*     */     //   62: aload #16
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 614, 0 -> 88, 1 -> 308
/*     */     //   88: aload #15
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_2
/*     */     //   94: invokestatic getExecutionAgentContext : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   97: astore #4
/*     */     //   99: aload_2
/*     */     //   100: aload_0
/*     */     //   101: getfield agentName : Ljava/lang/String;
/*     */     //   104: invokevirtual setTitle : (Ljava/lang/String;)V
/*     */     //   107: aload_1
/*     */     //   108: invokevirtual getPath : ()Ljava/lang/String;
/*     */     //   111: ifnull -> 196
/*     */     //   114: nop
/*     */     //   115: aload_1
/*     */     //   116: invokevirtual getPath : ()Ljava/lang/String;
/*     */     //   119: iconst_0
/*     */     //   120: anewarray java/lang/String
/*     */     //   123: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*     */     //   126: astore #6
/*     */     //   128: aload #6
/*     */     //   130: iconst_0
/*     */     //   131: anewarray java/nio/file/LinkOption
/*     */     //   134: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*     */     //   137: ifne -> 150
/*     */     //   140: aload #4
/*     */     //   142: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   147: goto -> 175
/*     */     //   150: aload #6
/*     */     //   152: <illegal opcode> invoke : (Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function0;
/*     */     //   157: invokestatic runReadAction : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*     */     //   160: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   163: dup
/*     */     //   164: ifnonnull -> 175
/*     */     //   167: pop
/*     */     //   168: aload #4
/*     */     //   170: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   175: astore #6
/*     */     //   177: goto -> 191
/*     */     //   180: astore #7
/*     */     //   182: aload #4
/*     */     //   184: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   189: astore #6
/*     */     //   191: aload #6
/*     */     //   193: goto -> 203
/*     */     //   196: aload #4
/*     */     //   198: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   203: astore #5
/*     */     //   205: getstatic com/intellij/openapi/util/SystemInfo.isWindows : Z
/*     */     //   208: ifeq -> 216
/*     */     //   211: ldc '\'
/*     */     //   213: goto -> 218
/*     */     //   216: ldc '/'
/*     */     //   218: astore #6
/*     */     //   220: new com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode
/*     */     //   223: dup
/*     */     //   224: ldc ''
/*     */     //   226: iconst_1
/*     */     //   227: aconst_null
/*     */     //   228: aconst_null
/*     */     //   229: bipush #12
/*     */     //   231: aconst_null
/*     */     //   232: invokespecial <init> : (Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   235: astore #7
/*     */     //   237: new kotlin/jvm/internal/Ref$BooleanRef
/*     */     //   240: dup
/*     */     //   241: invokespecial <init> : ()V
/*     */     //   244: astore #8
/*     */     //   246: aload #5
/*     */     //   248: aload_0
/*     */     //   249: aload #8
/*     */     //   251: aload_2
/*     */     //   252: aload #6
/*     */     //   254: aload #7
/*     */     //   256: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;)Lkotlin/jvm/functions/Function0;
/*     */     //   261: aload #16
/*     */     //   263: aload #16
/*     */     //   265: aload_0
/*     */     //   266: putfield L$0 : Ljava/lang/Object;
/*     */     //   269: aload #16
/*     */     //   271: aload #6
/*     */     //   273: putfield L$1 : Ljava/lang/Object;
/*     */     //   276: aload #16
/*     */     //   278: aload #7
/*     */     //   280: putfield L$2 : Ljava/lang/Object;
/*     */     //   283: aload #16
/*     */     //   285: aload #8
/*     */     //   287: putfield L$3 : Ljava/lang/Object;
/*     */     //   290: aload #16
/*     */     //   292: iconst_1
/*     */     //   293: putfield label : I
/*     */     //   296: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   299: dup
/*     */     //   300: aload #17
/*     */     //   302: if_acmpne -> 354
/*     */     //   305: aload #17
/*     */     //   307: areturn
/*     */     //   308: aload #16
/*     */     //   310: getfield L$3 : Ljava/lang/Object;
/*     */     //   313: checkcast kotlin/jvm/internal/Ref$BooleanRef
/*     */     //   316: astore #8
/*     */     //   318: aload #16
/*     */     //   320: getfield L$2 : Ljava/lang/Object;
/*     */     //   323: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode
/*     */     //   326: astore #7
/*     */     //   328: aload #16
/*     */     //   330: getfield L$1 : Ljava/lang/Object;
/*     */     //   333: checkcast java/lang/String
/*     */     //   336: astore #6
/*     */     //   338: aload #16
/*     */     //   340: getfield L$0 : Ljava/lang/Object;
/*     */     //   343: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker
/*     */     //   346: astore_0
/*     */     //   347: aload #15
/*     */     //   349: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   352: aload #15
/*     */     //   354: pop
/*     */     //   355: aload #8
/*     */     //   357: getfield element : Z
/*     */     //   360: ifeq -> 383
/*     */     //   363: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   366: dup
/*     */     //   367: new com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrResponse
/*     */     //   370: dup
/*     */     //   371: ldc ''
/*     */     //   373: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   376: aconst_null
/*     */     //   377: iconst_2
/*     */     //   378: aconst_null
/*     */     //   379: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   382: areturn
/*     */     //   383: aload #7
/*     */     //   385: invokevirtual getAllFilesNodes : ()Ljava/util/List;
/*     */     //   388: astore #9
/*     */     //   390: aload #7
/*     */     //   392: invokevirtual getAllDirNodes : ()Ljava/util/List;
/*     */     //   395: checkcast java/util/Collection
/*     */     //   398: aload #7
/*     */     //   400: invokevirtual getTopLevelFilesNodes : ()Ljava/util/List;
/*     */     //   403: checkcast java/lang/Iterable
/*     */     //   406: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   409: astore #10
/*     */     //   411: nop
/*     */     //   412: aload #9
/*     */     //   414: invokeinterface size : ()I
/*     */     //   419: aload_0
/*     */     //   420: getfield maxFiles : I
/*     */     //   423: if_icmpgt -> 445
/*     */     //   426: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion;
/*     */     //   429: aload #9
/*     */     //   431: ldc 'Below are all the project's files.'
/*     */     //   433: aload #6
/*     */     //   435: aload_0
/*     */     //   436: getfield maxOnePathLen : I
/*     */     //   439: invokevirtual toStringWithDescription : (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   442: goto -> 592
/*     */     //   445: aload #10
/*     */     //   447: invokeinterface size : ()I
/*     */     //   452: aload_0
/*     */     //   453: getfield maxDirectories : I
/*     */     //   456: if_icmpgt -> 478
/*     */     //   459: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion;
/*     */     //   462: aload #10
/*     */     //   464: ldc 'Below are the files in the project's root directory (`ls`) along with all the project's directories.'
/*     */     //   466: aload #6
/*     */     //   468: aload_0
/*     */     //   469: getfield maxOnePathLen : I
/*     */     //   472: invokevirtual toStringWithDescription : (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   475: goto -> 592
/*     */     //   478: aload_0
/*     */     //   479: getfield maxDepth : I
/*     */     //   482: istore #12
/*     */     //   484: aload #7
/*     */     //   486: iload #12
/*     */     //   488: aload #6
/*     */     //   490: iconst_0
/*     */     //   491: iconst_4
/*     */     //   492: aconst_null
/*     */     //   493: invokestatic getDirNodesUpToDepth$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;ILjava/lang/String;IILjava/lang/Object;)Ljava/util/List;
/*     */     //   496: astore #13
/*     */     //   498: iload #12
/*     */     //   500: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   505: astore #14
/*     */     //   507: aload #13
/*     */     //   509: invokeinterface size : ()I
/*     */     //   514: aload_0
/*     */     //   515: getfield maxDirectories : I
/*     */     //   518: if_icmple -> 567
/*     */     //   521: iload #12
/*     */     //   523: iconst_1
/*     */     //   524: if_icmple -> 567
/*     */     //   527: iinc #12, -1
/*     */     //   530: aload #7
/*     */     //   532: iload #12
/*     */     //   534: aload #6
/*     */     //   536: iconst_0
/*     */     //   537: iconst_4
/*     */     //   538: aconst_null
/*     */     //   539: invokestatic getDirNodesUpToDepth$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;ILjava/lang/String;IILjava/lang/Object;)Ljava/util/List;
/*     */     //   542: astore #13
/*     */     //   544: iload #12
/*     */     //   546: iconst_1
/*     */     //   547: if_icmple -> 560
/*     */     //   550: iload #12
/*     */     //   552: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   557: goto -> 562
/*     */     //   560: ldc 'Below are the files and directories in the project's root directory (`ls`).'
/*     */     //   562: astore #14
/*     */     //   564: goto -> 507
/*     */     //   567: aload #14
/*     */     //   569: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   574: astore #14
/*     */     //   576: getstatic com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode$Companion;
/*     */     //   579: aload #13
/*     */     //   581: aload #14
/*     */     //   583: aload #6
/*     */     //   585: aload_0
/*     */     //   586: getfield maxOnePathLen : I
/*     */     //   589: invokevirtual toStringWithDescription : (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   592: astore #11
/*     */     //   594: new com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   597: dup
/*     */     //   598: new com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrResponse
/*     */     //   601: dup
/*     */     //   602: aload #11
/*     */     //   604: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   607: aconst_null
/*     */     //   608: iconst_2
/*     */     //   609: aconst_null
/*     */     //   610: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   613: areturn
/*     */     //   614: new java/lang/IllegalStateException
/*     */     //   617: dup
/*     */     //   618: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   621: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   624: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #133	-> 60
/*     */     //   #134	-> 93
/*     */     //   #135	-> 99
/*     */     //   #136	-> 107
/*     */     //   #137	-> 114
/*     */     //   #138	-> 115
/*     */     //   #139	-> 128
/*     */     //   #140	-> 140
/*     */     //   #142	-> 150
/*     */     //   #144	-> 180
/*     */     //   #145	-> 182
/*     */     //   #148	-> 196
/*     */     //   #136	-> 203
/*     */     //   #150	-> 205
/*     */     //   #152	-> 220
/*     */     //   #153	-> 237
/*     */     //   #155	-> 246
/*     */     //   #133	-> 305
/*     */     //   #190	-> 354
/*     */     //   #191	-> 363
/*     */     //   #194	-> 383
/*     */     //   #195	-> 390
/*     */     //   #197	-> 411
/*     */     //   #198	-> 412
/*     */     //   #199	-> 445
/*     */     //   #201	-> 478
/*     */     //   #202	-> 484
/*     */     //   #203	-> 498
/*     */     //   #205	-> 507
/*     */     //   #206	-> 527
/*     */     //   #207	-> 530
/*     */     //   #208	-> 544
/*     */     //   #209	-> 550
/*     */     //   #211	-> 560
/*     */     //   #208	-> 562
/*     */     //   #214	-> 567
/*     */     //   #215	-> 576
/*     */     //   #197	-> 592
/*     */     //   #219	-> 594
/*     */     //   #133	-> 614
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	215	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;
/*     */     //   347	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;
/*     */     //   383	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;
/*     */     //   445	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;
/*     */     //   478	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;
/*     */     //   93	35	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrInput;
/*     */     //   93	206	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   99	78	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   180	11	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   196	7	4	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   205	94	5	rootDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   128	12	6	path	Ljava/nio/file/Path;
/*     */     //   150	13	6	path	Ljava/nio/file/Path;
/*     */     //   220	88	6	useSlash	Ljava/lang/String;
/*     */     //   338	25	6	useSlash	Ljava/lang/String;
/*     */     //   383	62	6	useSlash	Ljava/lang/String;
/*     */     //   445	33	6	useSlash	Ljava/lang/String;
/*     */     //   478	114	6	useSlash	Ljava/lang/String;
/*     */     //   237	71	7	rootNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   328	35	7	rootNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   383	62	7	rootNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   445	33	7	rootNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   478	89	7	rootNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   246	62	8	nodeLimitExceeded	Lkotlin/jvm/internal/Ref$BooleanRef;
/*     */     //   318	45	8	nodeLimitExceeded	Lkotlin/jvm/internal/Ref$BooleanRef;
/*     */     //   390	55	9	allFilesNodes	Ljava/util/List;
/*     */     //   411	34	10	allDirNodes	Ljava/util/List;
/*     */     //   445	33	10	allDirNodes	Ljava/util/List;
/*     */     //   594	20	11	displayNodes	Ljava/lang/String;
/*     */     //   484	83	12	currentDepth	I
/*     */     //   498	29	13	depthLimitedDirs	Ljava/util/List;
/*     */     //   544	48	13	depthLimitedDirs	Ljava/util/List;
/*     */     //   507	20	14	description	Ljava/lang/String;
/*     */     //   567	25	14	description	Ljava/lang/String;
/*     */     //   0	625	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	564	16	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	557	15	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   114	177	180	java/nio/file/InvalidPathException
/*     */   }
/*     */ 
/*     */   
/*     */   private static final VirtualFile produceArtifact$lambda$0(Path $path) {
/* 142 */     return VfsUtil.findFile($path, true);
/*     */   }
/*     */   
/*     */   private static final boolean produceArtifact$lambda$6(VirtualFile $rootDir, ProjectStrWorker this$0, Ref.BooleanRef $nodeLimitExceeded, ExecutionContext $context, String $useSlash, ProjectStrNode $rootNode) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore #6
/*     */     //   3: iconst_0
/*     */     //   4: istore #7
/*     */     //   6: new kotlin/jvm/internal/Ref$IntRef
/*     */     //   9: dup
/*     */     //   10: invokespecial <init> : ()V
/*     */     //   13: astore #8
/*     */     //   15: aload #6
/*     */     //   17: aconst_null
/*     */     //   18: aload #8
/*     */     //   20: aload_1
/*     */     //   21: aload_2
/*     */     //   22: aload_3
/*     */     //   23: aload #4
/*     */     //   25: aload #5
/*     */     //   27: <illegal opcode> processFile : (Lkotlin/jvm/internal/Ref$IntRef;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;)Lcom/intellij/openapi/roots/ContentIterator;
/*     */     //   32: invokestatic iterateChildrenRecursively : (Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/openapi/vfs/VirtualFileFilter;Lcom/intellij/openapi/roots/ContentIterator;)Z
/*     */     //   35: nop
/*     */     //   36: nop
/*     */     //   37: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #156	-> 0
/*     */     //   #157	-> 6
/*     */     //   #158	-> 15
/*     */     //   #185	-> 35
/*     */     //   #156	-> 36
/*     */     //   #186	-> 37
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   6	30	7	$i$a$-let-ProjectStrWorker$produceArtifact$2$1	I
/*     */     //   15	21	8	nodeCount	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   3	33	6	dir	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	38	0	$rootDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	38	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;
/*     */     //   0	38	2	$nodeLimitExceeded	Lkotlin/jvm/internal/Ref$BooleanRef;
/*     */     //   0	38	3	$context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   0	38	4	$useSlash	Ljava/lang/String;
/*     */     //   0	38	5	$rootNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */   }
/*     */   
/*     */   private static final boolean produceArtifact$lambda$6$lambda$5$lambda$4(Ref.IntRef $nodeCount, ProjectStrWorker this$0, Ref.BooleanRef $nodeLimitExceeded, ExecutionContext $context, String $useSlash, ProjectStrNode $rootNode, VirtualFile file) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc_w 'file'
/*     */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   8: aload_0
/*     */     //   9: getfield element : I
/*     */     //   12: istore #7
/*     */     //   14: aload_0
/*     */     //   15: iload #7
/*     */     //   17: iconst_1
/*     */     //   18: iadd
/*     */     //   19: putfield element : I
/*     */     //   22: aload_0
/*     */     //   23: getfield element : I
/*     */     //   26: aload_1
/*     */     //   27: getfield nodeLimit : I
/*     */     //   30: if_icmplt -> 40
/*     */     //   33: aload_2
/*     */     //   34: iconst_1
/*     */     //   35: putfield element : Z
/*     */     //   38: iconst_0
/*     */     //   39: ireturn
/*     */     //   40: aload #6
/*     */     //   42: aload_3
/*     */     //   43: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   46: invokestatic relativeName : (Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/openapi/project/Project;)Ljava/lang/String;
/*     */     //   49: astore #7
/*     */     //   51: aload #7
/*     */     //   53: ifnull -> 405
/*     */     //   56: aload #7
/*     */     //   58: checkcast java/lang/CharSequence
/*     */     //   61: iconst_1
/*     */     //   62: anewarray java/lang/String
/*     */     //   65: astore #9
/*     */     //   67: aload #9
/*     */     //   69: iconst_0
/*     */     //   70: aload #4
/*     */     //   72: aastore
/*     */     //   73: aload #9
/*     */     //   75: iconst_0
/*     */     //   76: iconst_0
/*     */     //   77: bipush #6
/*     */     //   79: aconst_null
/*     */     //   80: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   83: astore #8
/*     */     //   85: aload #8
/*     */     //   87: checkcast java/lang/Iterable
/*     */     //   90: astore #10
/*     */     //   92: iconst_0
/*     */     //   93: istore #11
/*     */     //   95: aload #10
/*     */     //   97: instanceof java/util/Collection
/*     */     //   100: ifeq -> 120
/*     */     //   103: aload #10
/*     */     //   105: checkcast java/util/Collection
/*     */     //   108: invokeinterface isEmpty : ()Z
/*     */     //   113: ifeq -> 120
/*     */     //   116: iconst_0
/*     */     //   117: goto -> 196
/*     */     //   120: aload #10
/*     */     //   122: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   127: astore #12
/*     */     //   129: aload #12
/*     */     //   131: invokeinterface hasNext : ()Z
/*     */     //   136: ifeq -> 195
/*     */     //   139: aload #12
/*     */     //   141: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   146: astore #13
/*     */     //   148: aload #13
/*     */     //   150: checkcast java/lang/String
/*     */     //   153: astore #14
/*     */     //   155: iconst_0
/*     */     //   156: istore #15
/*     */     //   158: aload #14
/*     */     //   160: ldc_w '.'
/*     */     //   163: iconst_0
/*     */     //   164: iconst_2
/*     */     //   165: aconst_null
/*     */     //   166: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   169: ifne -> 183
/*     */     //   172: aload #14
/*     */     //   174: ldc_w '__pycache__'
/*     */     //   177: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   180: ifeq -> 187
/*     */     //   183: iconst_1
/*     */     //   184: goto -> 188
/*     */     //   187: iconst_0
/*     */     //   188: ifeq -> 129
/*     */     //   191: iconst_1
/*     */     //   192: goto -> 196
/*     */     //   195: iconst_0
/*     */     //   196: istore #9
/*     */     //   198: iload #9
/*     */     //   200: ifne -> 405
/*     */     //   203: aconst_null
/*     */     //   204: astore #10
/*     */     //   206: aload #5
/*     */     //   208: astore #10
/*     */     //   210: iconst_0
/*     */     //   211: istore #11
/*     */     //   213: aload #8
/*     */     //   215: checkcast java/util/Collection
/*     */     //   218: invokeinterface size : ()I
/*     */     //   223: istore #12
/*     */     //   225: iload #11
/*     */     //   227: iload #12
/*     */     //   229: if_icmpge -> 405
/*     */     //   232: aload #8
/*     */     //   234: iload #11
/*     */     //   236: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   241: checkcast java/lang/String
/*     */     //   244: astore #13
/*     */     //   246: iload #11
/*     */     //   248: aload #8
/*     */     //   250: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   253: if_icmpne -> 260
/*     */     //   256: iconst_1
/*     */     //   257: goto -> 261
/*     */     //   260: iconst_0
/*     */     //   261: istore #14
/*     */     //   263: aload #6
/*     */     //   265: invokevirtual isDirectory : ()Z
/*     */     //   268: ifne -> 276
/*     */     //   271: iload #14
/*     */     //   273: ifne -> 280
/*     */     //   276: iconst_1
/*     */     //   277: goto -> 281
/*     */     //   280: iconst_0
/*     */     //   281: istore #15
/*     */     //   283: aload #10
/*     */     //   285: invokevirtual getChildren : ()Ljava/util/List;
/*     */     //   288: checkcast java/lang/Iterable
/*     */     //   291: astore #18
/*     */     //   293: aload #18
/*     */     //   295: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   300: astore #19
/*     */     //   302: aload #19
/*     */     //   304: invokeinterface hasNext : ()Z
/*     */     //   309: ifeq -> 349
/*     */     //   312: aload #19
/*     */     //   314: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   319: astore #20
/*     */     //   321: aload #20
/*     */     //   323: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode
/*     */     //   326: astore #21
/*     */     //   328: iconst_0
/*     */     //   329: istore #22
/*     */     //   331: aload #21
/*     */     //   333: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   336: aload #13
/*     */     //   338: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   341: ifeq -> 302
/*     */     //   344: aload #20
/*     */     //   346: goto -> 350
/*     */     //   349: aconst_null
/*     */     //   350: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode
/*     */     //   353: dup
/*     */     //   354: ifnonnull -> 393
/*     */     //   357: pop
/*     */     //   358: new com/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode
/*     */     //   361: dup
/*     */     //   362: aload #13
/*     */     //   364: iload #15
/*     */     //   366: aload #10
/*     */     //   368: aconst_null
/*     */     //   369: bipush #8
/*     */     //   371: aconst_null
/*     */     //   372: invokespecial <init> : (Ljava/lang/String;ZLcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   375: astore #17
/*     */     //   377: aload #17
/*     */     //   379: astore #18
/*     */     //   381: iconst_0
/*     */     //   382: istore #19
/*     */     //   384: aload #10
/*     */     //   386: aload #18
/*     */     //   388: invokevirtual addChild : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;)V
/*     */     //   391: aload #17
/*     */     //   393: astore #16
/*     */     //   395: aload #16
/*     */     //   397: astore #10
/*     */     //   399: iinc #11, 1
/*     */     //   402: goto -> 225
/*     */     //   405: iconst_1
/*     */     //   406: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #159	-> 8
/*     */     //   #160	-> 22
/*     */     //   #161	-> 33
/*     */     //   #162	-> 38
/*     */     //   #165	-> 40
/*     */     //   #166	-> 51
/*     */     //   #167	-> 56
/*     */     //   #168	-> 85
/*     */     //   #223	-> 95
/*     */     //   #224	-> 120
/*     */     //   #168	-> 158
/*     */     //   #224	-> 188
/*     */     //   #225	-> 195
/*     */     //   #168	-> 196
/*     */     //   #169	-> 198
/*     */     //   #170	-> 203
/*     */     //   #172	-> 210
/*     */     //   #173	-> 232
/*     */     //   #174	-> 246
/*     */     //   #175	-> 263
/*     */     //   #177	-> 283
/*     */     //   #226	-> 328
/*     */     //   #177	-> 331
/*     */     //   #177	-> 341
/*     */     //   #177	-> 350
/*     */     //   #178	-> 358
/*     */     //   #226	-> 381
/*     */     //   #178	-> 384
/*     */     //   #178	-> 391
/*     */     //   #177	-> 393
/*     */     //   #180	-> 395
/*     */     //   #172	-> 399
/*     */     //   #184	-> 405
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   158	30	15	$i$a$-any-ProjectStrWorker$produceArtifact$2$1$1$shouldSkip$1	I
/*     */     //   155	33	14	it	Ljava/lang/String;
/*     */     //   148	47	13	element$iv	Ljava/lang/Object;
/*     */     //   95	101	11	$i$f$any	I
/*     */     //   92	104	10	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   331	10	22	$i$a$-find-ProjectStrWorker$produceArtifact$2$1$1$childNode$1	I
/*     */     //   328	13	21	it	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   384	7	19	$i$a$-also-ProjectStrWorker$produceArtifact$2$1$1$childNode$2	I
/*     */     //   381	10	18	it	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   246	153	13	component	Ljava/lang/String;
/*     */     //   263	136	14	isLastComponent	Z
/*     */     //   283	116	15	isDirectory	Z
/*     */     //   395	4	16	childNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   213	192	11	i	I
/*     */     //   206	199	10	currentNode	Ljava/lang/Object;
/*     */     //   85	320	8	pathComponents	Ljava/util/List;
/*     */     //   198	207	9	shouldSkip	Z
/*     */     //   51	356	7	relativePath	Ljava/lang/String;
/*     */     //   0	407	0	$nodeCount	Lkotlin/jvm/internal/Ref$IntRef;
/*     */     //   0	407	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrWorker;
/*     */     //   0	407	2	$nodeLimitExceeded	Lkotlin/jvm/internal/Ref$BooleanRef;
/*     */     //   0	407	3	$context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   0	407	4	$useSlash	Ljava/lang/String;
/*     */     //   0	407	5	$rootNode	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/ProjectStrNode;
/*     */     //   0	407	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ProjectStrWorker.kt", l = {155}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "useSlash", "rootNode", "nodeLimitExceeded"}, m = "produceArtifact", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.ProjectStrWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ProjectStrWorker$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     ProjectStrWorker$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ProjectStrWorker.this.produceArtifact((ProjectStrInput)null, (ExecutionContext)null, (Continuation<? super ArtifactResponse<ProjectStrResponse>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\ProjectStrWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */