/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ide.impl.OpenProjectTaskBuilder;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.io.FileUtil;
/*    */ import com.intellij.openapi.vfs.VfsUtil;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.openapi.vfs.VirtualFileFilter;
/*    */ import com.intellij.openapi.vfs.VirtualFileManager;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {59, 79}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/openapi/project/Project;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nAbstractMultiAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,214:1\n40#2,3:215\n*S KotlinDebug\n*F\n+ 1 AbstractMultiAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2\n*L\n78#1:215,3\n*E\n"})
/*    */ final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Project>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   MatterhornForkedLocalExecutor$executeInForkedEnvironment$2(Path $tempDirPath, VirtualFile $originalProjectDir, String $name, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #4
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 247, 0 -> 36, 1 -> 78, 2 -> 220
/*    */     //   36: aload_1
/*    */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   40: aload_0
/*    */     //   41: getfield $tempDirPath : Ljava/nio/file/Path;
/*    */     //   44: aload_0
/*    */     //   45: getfield $originalProjectDir : Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   48: aload_0
/*    */     //   49: getfield $name : Ljava/lang/String;
/*    */     //   52: <illegal opcode> invoke : (Ljava/nio/file/Path;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   57: aload_0
/*    */     //   58: checkcast kotlin/coroutines/Continuation
/*    */     //   61: aload_0
/*    */     //   62: iconst_1
/*    */     //   63: putfield label : I
/*    */     //   66: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   69: dup
/*    */     //   70: aload #4
/*    */     //   72: if_acmpne -> 83
/*    */     //   75: aload #4
/*    */     //   77: areturn
/*    */     //   78: aload_1
/*    */     //   79: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   82: aload_1
/*    */     //   83: pop
/*    */     //   84: iconst_0
/*    */     //   85: istore_2
/*    */     //   86: ldc com/intellij/ide/GeneralSettings
/*    */     //   88: astore_3
/*    */     //   89: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */     //   92: aload_3
/*    */     //   93: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*    */     //   98: dup
/*    */     //   99: ifnonnull -> 164
/*    */     //   102: pop
/*    */     //   103: new java/lang/RuntimeException
/*    */     //   106: dup
/*    */     //   107: new java/lang/StringBuilder
/*    */     //   110: dup
/*    */     //   111: invokespecial <init> : ()V
/*    */     //   114: ldc 'Cannot find service '
/*    */     //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   119: aload_3
/*    */     //   120: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc ' (classloader='
/*    */     //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   131: aload_3
/*    */     //   132: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*    */     //   135: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   138: ldc ', client='
/*    */     //   140: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   143: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*    */     //   146: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*    */     //   149: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   152: bipush #41
/*    */     //   154: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   157: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   160: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   163: athrow
/*    */     //   164: nop
/*    */     //   165: checkcast com/intellij/ide/GeneralSettings
/*    */     //   168: iconst_0
/*    */     //   169: invokevirtual setConfirmOpenNewProject : (I)V
/*    */     //   172: getstatic com/intellij/platform/CommandLineProjectOpenProcessor.Companion : Lcom/intellij/platform/CommandLineProjectOpenProcessor$Companion;
/*    */     //   175: invokevirtual getInstance : ()Lcom/intellij/platform/CommandLineProjectOpenProcessor;
/*    */     //   178: aload_0
/*    */     //   179: getfield $tempDirPath : Ljava/nio/file/Path;
/*    */     //   182: astore_3
/*    */     //   183: aload_3
/*    */     //   184: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   187: aload_3
/*    */     //   188: iconst_0
/*    */     //   189: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   194: invokestatic OpenProjectTask : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/ide/impl/OpenProjectTask;
/*    */     //   197: aload_0
/*    */     //   198: checkcast kotlin/coroutines/Continuation
/*    */     //   201: aload_0
/*    */     //   202: iconst_2
/*    */     //   203: putfield label : I
/*    */     //   206: invokeinterface openProjectAndFile : (Ljava/nio/file/Path;ZLcom/intellij/ide/impl/OpenProjectTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   211: dup
/*    */     //   212: aload #4
/*    */     //   214: if_acmpne -> 225
/*    */     //   217: aload #4
/*    */     //   219: areturn
/*    */     //   220: aload_1
/*    */     //   221: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   224: aload_1
/*    */     //   225: checkcast com/intellij/openapi/project/Project
/*    */     //   228: dup
/*    */     //   229: ifnonnull -> 246
/*    */     //   232: pop
/*    */     //   233: new java/lang/IllegalStateException
/*    */     //   236: dup
/*    */     //   237: ldc 'No project was found to open in directory'
/*    */     //   239: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   242: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   245: athrow
/*    */     //   246: areturn
/*    */     //   247: new java/lang/IllegalStateException
/*    */     //   250: dup
/*    */     //   251: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   253: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   256: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #58	-> 3
/*    */     //   #59	-> 40
/*    */     //   #58	-> 75
/*    */     //   #78	-> 83
/*    */     //   #215	-> 86
/*    */     //   #216	-> 89
/*    */     //   #217	-> 103
/*    */     //   #216	-> 164
/*    */     //   #78	-> 168
/*    */     //   #79	-> 172
/*    */     //   #58	-> 217
/*    */     //   #79	-> 225
/*    */     //   #82	-> 237
/*    */     //   #58	-> 247
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   89	76	3	serviceClass$iv	Ljava/lang/Class;
/*    */     //   86	79	2	$i$f$service	I
/*    */     //   0	257	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2;
/*    */     //   40	207	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$2> $completion) {
/*    */     return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$2(this.$tempDirPath, this.$originalProjectDir, this.$name, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(Path $tempDirPath, VirtualFile $originalProjectDir, String $name) {
/*    */     VirtualFile tempDir;
/* 60 */     Intrinsics.checkNotNull($tempDirPath); if (VfsUtil.createDirectoryIfMissing($tempDirPath.toString()) == null) { VfsUtil.createDirectoryIfMissing($tempDirPath.toString()); throw new IllegalStateException("Failed to create temporary directory".toString()); }
/*    */      try {
/* 62 */       VirtualFileManager.getInstance().syncRefresh();
/* 63 */       VfsUtil.copyDirectory(null, $originalProjectDir, tempDir, new MatterhornForkedLocalExecutor$executeInForkedEnvironment$2$1$1());
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 70 */       String str = $name + "==Directory created: " + $name; System.out.println(str);
/*    */     }
/* 72 */     catch (Exception e) {
/* 73 */       FileUtil.delete($tempDirPath.toFile());
/* 74 */       throw new IllegalStateException("Failed to copy project files: " + e.getMessage(), e);
/*    */     } 
/* 76 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$1(OpenProjectTaskBuilder $this$OpenProjectTask) {
/* 80 */     $this$OpenProjectTask.setForceOpenInNewFrame(true);
/* 81 */     $this$OpenProjectTask.setRunConfigurators(true);
/* 82 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor$executeInForkedEnvironment$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */