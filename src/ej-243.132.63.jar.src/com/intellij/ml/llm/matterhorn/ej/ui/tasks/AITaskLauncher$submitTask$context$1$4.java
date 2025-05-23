package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import com.intellij.openapi.project.Project;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(f = "AITaskLauncher.kt", l = {236}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$submitTask$context$1$4")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Ljava/nio/file/Path;"})
final class null extends SuspendLambda implements Function2<Path, Continuation<? super Boolean>, Object> {
  int label;
  
  null(Project $project, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 98, 0 -> 32, 1 -> 75
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast java/nio/file/Path
    //   43: astore_2
    //   44: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/OutOfProjectFilesFileDetector
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: aload_0
    //   52: getfield $project : Lcom/intellij/openapi/project/Project;
    //   55: aload_2
    //   56: aload_0
    //   57: checkcast kotlin/coroutines/Continuation
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield label : I
    //   65: invokevirtual isSensitiveFile : (Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   68: dup
    //   69: aload_3
    //   70: if_acmpne -> 80
    //   73: aload_3
    //   74: areturn
    //   75: aload_1
    //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   79: aload_1
    //   80: checkcast java/lang/Boolean
    //   83: invokevirtual booleanValue : ()Z
    //   86: ifne -> 93
    //   89: iconst_1
    //   90: goto -> 94
    //   93: iconst_0
    //   94: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
    //   97: areturn
    //   98: new java/lang/IllegalStateException
    //   101: dup
    //   102: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   104: invokespecial <init> : (Ljava/lang/String;)V
    //   107: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #236	-> 3
    //   #236	-> 44
    //   #236	-> 73
    //   #236	-> 80
    //   #236	-> 98
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	24	2	it	Ljava/nio/file/Path;
    //   0	108	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$context$1$4;
    //   36	62	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    Object object = new Object(this.$project, $completion);
    object.L$0 = value;
    return (Continuation<Unit>)object;
  }
  
  public final Object invoke(Path p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\AITaskLauncher$submitTask$context$1$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */