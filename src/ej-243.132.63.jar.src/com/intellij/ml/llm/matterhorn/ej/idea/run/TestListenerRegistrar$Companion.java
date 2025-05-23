/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.extensions.ExtensionPointName;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListenerRegistrar$Companion;", "", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListenerRegistrar;", "register", "", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;", "ej-idea"})
/*    */ public final class Companion {
/*    */   public final void register(@NotNull Project project, @NotNull Disposable disposable, @NotNull TestListener listener) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'project'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'disposable'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'listener'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: getstatic com/intellij/ml/llm/matterhorn/ej/idea/run/TestListenerRegistrar$Companion.EP_NAME : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */     //   21: aload_1
/*    */     //   22: aload_2
/*    */     //   23: aload_3
/*    */     //   24: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;)Lkotlin/jvm/functions/Function1;
/*    */     //   29: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*    */     //   34: invokevirtual forEachExtensionSafe : (Ljava/util/function/Consumer;)V
/*    */     //   37: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 18
/*    */     //   #24	-> 37
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListenerRegistrar$Companion;
/*    */     //   0	38	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	38	2	disposable	Lcom/intellij/openapi/Disposable;
/*    */     //   0	38	3	listener	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;
/*    */   }
/*    */   
/*    */   @NotNull
/* 16 */   private static final ExtensionPointName<TestListenerRegistrar> EP_NAME = ExtensionPointName.Companion.create(
/* 17 */       "com.intellij.ml.llm.matterhorn.run.testListenerRegistrar");
/*    */ 
/*    */   
/*    */   private static final void register$lambda$1(Function1 $tmp0, Object p0) {
/* 21 */     $tmp0.invoke(p0); } private static final Unit register$lambda$0(Project $project, Disposable $disposable, TestListener $listener, TestListenerRegistrar it) {
/* 22 */     Intrinsics.checkNotNullParameter(it, "it"); it.register($project, $disposable, $listener);
/* 23 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\TestListenerRegistrar$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */