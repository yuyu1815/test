/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornProperty;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.io.path.PathsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\0322\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\022\020\013\032\016\022\004\022\0020\001\022\004\022\0020\0060\fH@¢\006\002\020\r¨\006\016"}, d2 = {"relativeName", "", "Ljava/nio/file/Path;", "project", "Lcom/intellij/openapi/project/Project;", "setup", "", "property", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "action", "Lkotlin/Function1;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matterhorn"})
/*    */ public final class CommandLineStarterKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String relativeName(@NotNull Path $this$relativeName, @NotNull Project project) {
/* 56 */     Intrinsics.checkNotNullParameter($this$relativeName, "<this>"); Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNull(project.getBasePath()); Intrinsics.checkNotNullExpressionValue(Path.of(project.getBasePath(), new String[0]), "of(...)"); if (PathsKt.relativeToOrNull($this$relativeName, Path.of(project.getBasePath(), new String[0])) == null || PathsKt.relativeToOrNull($this$relativeName, Path.of(project.getBasePath(), new String[0])).toString() == null) PathsKt.relativeToOrNull($this$relativeName, Path.of(project.getBasePath(), new String[0])).toString();  return PathsKt.getName($this$relativeName);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public static final Object setup(@NotNull MatterhornProperty property, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Function1 action, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarterKt$setup$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarterKt$setup$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 49
/*    */     //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarterKt$setup$1
/*    */     //   42: dup
/*    */     //   43: aload_3
/*    */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   47: astore #6
/*    */     //   49: aload #6
/*    */     //   51: getfield result : Ljava/lang/Object;
/*    */     //   54: astore #5
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #7
/*    */     //   61: aload #6
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 162, 0 -> 88, 1 -> 123
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: aload_0
/*    */     //   95: aload #6
/*    */     //   97: aload #6
/*    */     //   99: aload_2
/*    */     //   100: putfield L$0 : Ljava/lang/Object;
/*    */     //   103: aload #6
/*    */     //   105: iconst_1
/*    */     //   106: putfield label : I
/*    */     //   109: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   114: dup
/*    */     //   115: aload #7
/*    */     //   117: if_acmpne -> 139
/*    */     //   120: aload #7
/*    */     //   122: areturn
/*    */     //   123: aload #6
/*    */     //   125: getfield L$0 : Ljava/lang/Object;
/*    */     //   128: checkcast kotlin/jvm/functions/Function1
/*    */     //   131: astore_2
/*    */     //   132: aload #5
/*    */     //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   137: aload #5
/*    */     //   139: checkcast java/lang/String
/*    */     //   142: astore #4
/*    */     //   144: aload #4
/*    */     //   146: ifnull -> 158
/*    */     //   149: aload_2
/*    */     //   150: aload #4
/*    */     //   152: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   157: pop
/*    */     //   158: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   161: areturn
/*    */     //   162: new java/lang/IllegalStateException
/*    */     //   165: dup
/*    */     //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   168: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   171: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 59
/*    */     //   #60	-> 93
/*    */     //   #59	-> 120
/*    */     //   #61	-> 144
/*    */     //   #62	-> 149
/*    */     //   #64	-> 158
/*    */     //   #59	-> 162
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	21	0	property	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*    */     //   93	21	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   93	30	2	action	Lkotlin/jvm/functions/Function1;
/*    */     //   132	26	2	action	Lkotlin/jvm/functions/Function1;
/*    */     //   144	14	4	value	Ljava/lang/String;
/*    */     //   0	172	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   49	113	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	106	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "CommandLineStarter.kt", l = {60}, i = {0}, s = {"L$0"}, n = {"action"}, m = "setup", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarterKt")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class CommandLineStarterKt$setup$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     CommandLineStarterKt$setup$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return CommandLineStarterKt.setup(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarterKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */