/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ 
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.projectRoots.Sdk;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\bf\030\000 \r2\0020\001:\001\rJ$\020\002\032\0020\0032\006\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007H@¢\006\002\020\tJ\030\020\n\032\0020\0032\006\020\004\032\0020\0052\006\020\013\032\0020\fH\026¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator;", "", "configureProject", "", "project", "Lcom/intellij/openapi/project/Project;", "args", "", "", "(Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureProjectSdk", "javaHomeSdk", "Lcom/intellij/openapi/projectRoots/Sdk;", "Companion", "ej-idea"})
/*    */ public interface IdeaProjectConfigurator {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J$\020\007\032\0020\b2\006\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\r0\fH@¢\006\002\020\016J\026\020\017\032\0020\b2\006\020\t\032\0020\n2\006\020\020\032\0020\021R\031\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\002\n\000¨\006\001¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator;", "configureProject", "", "project", "Lcom/intellij/openapi/project/Project;", "args", "", "", "(Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureProjectSdk", "javaHomeSdk", "Lcom/intellij/openapi/projectRoots/Sdk;", "ej-idea"})
/*    */   public static final class Companion { @Nullable
/*    */     public final Object configureProject(@NotNull Project project, @NotNull List args, @NotNull Continuation $completion) {
/*    */       // Byte code:
/*    */       //   0: aload_3
/*    */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator$Companion$configureProject$1
/*    */       //   4: ifeq -> 39
/*    */       //   7: aload_3
/*    */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator$Companion$configureProject$1
/*    */       //   11: astore #7
/*    */       //   13: aload #7
/*    */       //   15: getfield label : I
/*    */       //   18: ldc -2147483648
/*    */       //   20: iand
/*    */       //   21: ifeq -> 39
/*    */       //   24: aload #7
/*    */       //   26: dup
/*    */       //   27: getfield label : I
/*    */       //   30: ldc -2147483648
/*    */       //   32: isub
/*    */       //   33: putfield label : I
/*    */       //   36: goto -> 50
/*    */       //   39: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator$Companion$configureProject$1
/*    */       //   42: dup
/*    */       //   43: aload_0
/*    */       //   44: aload_3
/*    */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator$Companion;Lkotlin/coroutines/Continuation;)V
/*    */       //   48: astore #7
/*    */       //   50: aload #7
/*    */       //   52: getfield result : Ljava/lang/Object;
/*    */       //   55: astore #6
/*    */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   60: astore #8
/*    */       //   62: aload #7
/*    */       //   64: getfield label : I
/*    */       //   67: tableswitch default -> 216, 0 -> 88, 1 -> 173
/*    */       //   88: aload #6
/*    */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   93: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator.EP_NAME : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */       //   96: invokevirtual getExtensionList : ()Ljava/util/List;
/*    */       //   99: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */       //   104: astore #4
/*    */       //   106: aload #4
/*    */       //   108: invokeinterface hasNext : ()Z
/*    */       //   113: ifeq -> 212
/*    */       //   116: aload #4
/*    */       //   118: invokeinterface next : ()Ljava/lang/Object;
/*    */       //   123: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator
/*    */       //   126: astore #5
/*    */       //   128: aload #5
/*    */       //   130: aload_1
/*    */       //   131: aload_2
/*    */       //   132: aload #7
/*    */       //   134: aload #7
/*    */       //   136: aload_1
/*    */       //   137: putfield L$0 : Ljava/lang/Object;
/*    */       //   140: aload #7
/*    */       //   142: aload_2
/*    */       //   143: putfield L$1 : Ljava/lang/Object;
/*    */       //   146: aload #7
/*    */       //   148: aload #4
/*    */       //   150: putfield L$2 : Ljava/lang/Object;
/*    */       //   153: aload #7
/*    */       //   155: iconst_1
/*    */       //   156: putfield label : I
/*    */       //   159: invokeinterface configureProject : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   164: dup
/*    */       //   165: aload #8
/*    */       //   167: if_acmpne -> 208
/*    */       //   170: aload #8
/*    */       //   172: areturn
/*    */       //   173: aload #7
/*    */       //   175: getfield L$2 : Ljava/lang/Object;
/*    */       //   178: checkcast java/util/Iterator
/*    */       //   181: astore #4
/*    */       //   183: aload #7
/*    */       //   185: getfield L$1 : Ljava/lang/Object;
/*    */       //   188: checkcast java/util/List
/*    */       //   191: astore_2
/*    */       //   192: aload #7
/*    */       //   194: getfield L$0 : Ljava/lang/Object;
/*    */       //   197: checkcast com/intellij/openapi/project/Project
/*    */       //   200: astore_1
/*    */       //   201: aload #6
/*    */       //   203: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   206: aload #6
/*    */       //   208: pop
/*    */       //   209: goto -> 106
/*    */       //   212: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   215: areturn
/*    */       //   216: new java/lang/IllegalStateException
/*    */       //   219: dup
/*    */       //   220: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   222: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   225: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #38	-> 60
/*    */       //   #39	-> 93
/*    */       //   #40	-> 128
/*    */       //   #38	-> 170
/*    */       //   #40	-> 208
/*    */       //   #42	-> 212
/*    */       //   #38	-> 216
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   93	80	1	project	Lcom/intellij/openapi/project/Project;
/*    */       //   201	15	1	project	Lcom/intellij/openapi/project/Project;
/*    */       //   93	80	2	args	Ljava/util/List;
/*    */       //   192	24	2	args	Ljava/util/List;
/*    */       //   128	36	5	configurator	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator;
/*    */       //   0	226	3	$completion	Lkotlin/coroutines/Continuation;
/*    */       //   50	166	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */       //   57	159	6	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {40}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"project", "args"}, m = "configureProject", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfigurator$Companion")
/*    */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */     static final class IdeaProjectConfigurator$Companion$configureProject$1 extends ContinuationImpl {
/*    */       Object L$0;
/*    */       Object L$1;
/*    */       Object L$2;
/*    */       int label;
/*    */       
/*    */       IdeaProjectConfigurator$Companion$configureProject$1(Continuation $completion) {
/*    */         super($completion);
/*    */       }
/*    */       
/*    */       @Nullable
/*    */       public final Object invokeSuspend(@NotNull Object $result) {
/*    */         this.result = $result;
/*    */         this.label |= Integer.MIN_VALUE;
/*    */         return IdeaProjectConfigurator.Companion.this.configureProject(null, null, (Continuation<? super Unit>)this);
/*    */       }
/*    */     }
/*    */     
/* 45 */     public final void configureProjectSdk(@NotNull Project project, @NotNull Sdk javaHomeSdk) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(javaHomeSdk, "javaHomeSdk"); for (IdeaProjectConfigurator configurator : IdeaProjectConfigurator.EP_NAME.getExtensionList())
/* 46 */         configurator.configureProjectSdk(project, javaHomeSdk);  } } @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @JvmField
/*    */   @NotNull
/*    */   public static final ExtensionPointName<IdeaProjectConfigurator> EP_NAME = ExtensionPointName.Companion.create("com.intellij.ml.llm.matterhorn.idea.projectConfigurator"); @Nullable
/*    */   Object configureProject(@NotNull Project paramProject, @NotNull List<String> paramList, @NotNull Continuation<? super Unit> paramContinuation); void configureProjectSdk(@NotNull Project paramProject, @NotNull Sdk paramSdk); @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls { @Nullable
/* 52 */     public static Object configureProject(@NotNull IdeaProjectConfigurator $this, @NotNull Project project, @NotNull List args, @NotNull Continuation $completion) { return Unit.INSTANCE; }
/*    */     
/*    */     public static void configureProjectSdk(@NotNull IdeaProjectConfigurator $this, @NotNull Project project, @NotNull Sdk javaHomeSdk) {
/* 55 */       Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(javaHomeSdk, "javaHomeSdk");
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaProjectConfigurator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */