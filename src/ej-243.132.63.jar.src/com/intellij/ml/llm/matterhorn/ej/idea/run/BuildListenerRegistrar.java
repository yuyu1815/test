/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\000 \n2\0020\001:\001\nJ \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListenerRegistrar;", "", "register", "", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;", "Companion", "ej-idea"})
/*    */ public interface BuildListenerRegistrar {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   void register(@NotNull Project paramProject, @NotNull Disposable paramDisposable, @NotNull BuildListener paramBuildListener);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\024\020\004\032\b\022\004\022\0020\0010\005X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListenerRegistrar$Companion;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListenerRegistrar;", "<init>", "()V", "EP_NAME", "Lcom/intellij/openapi/extensions/ExtensionPointName;", "register", "", "project", "Lcom/intellij/openapi/project/Project;", "disposable", "Lcom/intellij/openapi/Disposable;", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;", "ej-idea"})
/*    */   public static final class Companion implements BuildListenerRegistrar {
/*    */     @NotNull
/* 15 */     private static final ExtensionPointName<BuildListenerRegistrar> EP_NAME = ExtensionPointName.Companion.create("com.intellij.ml.llm.matterhorn.run.buildListenerRegistrar");
/*    */     public void register(@NotNull Project project, @NotNull Disposable disposable, @NotNull BuildListener listener) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'project'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_2
/*    */       //   7: ldc 'disposable'
/*    */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   12: aload_3
/*    */       //   13: ldc 'listener'
/*    */       //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   18: getstatic com/intellij/ml/llm/matterhorn/ej/idea/run/BuildListenerRegistrar$Companion.EP_NAME : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*    */       //   21: aload_1
/*    */       //   22: aload_2
/*    */       //   23: aload_3
/*    */       //   24: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;)Lkotlin/jvm/functions/Function1;
/*    */       //   29: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*    */       //   34: invokevirtual forEachExtensionSafe : (Ljava/util/function/Consumer;)V
/*    */       //   37: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #18	-> 18
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListenerRegistrar$Companion;
/*    */       //   0	38	1	project	Lcom/intellij/openapi/project/Project;
/*    */       //   0	38	2	disposable	Lcom/intellij/openapi/Disposable;
/*    */       //   0	38	3	listener	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;
/* 18 */     } private static final Unit register$lambda$0(Project $project, Disposable $disposable, BuildListener $listener, BuildListenerRegistrar it) { Intrinsics.checkNotNullParameter(it, "it"); it.register($project, $disposable, $listener); return Unit.INSTANCE; } private static final void register$lambda$1(Function1 $tmp0, Object p0) { $tmp0.invoke(p0); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\BuildListenerRegistrar.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */