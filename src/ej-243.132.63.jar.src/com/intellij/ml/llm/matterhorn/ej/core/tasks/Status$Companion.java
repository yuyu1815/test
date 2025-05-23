package com.intellij.ml.llm.matterhorn.ej.core.tasks;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\f\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/Status$Companion;", "", "<init>", "()V", "fromSymbol", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/Status;", "symbol", "", "ej-core"})
@SourceDebugExtension({"SMAP\nPlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Plan.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/Status$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class Companion {
  private Companion() {}
  
  @NotNull
  public final Status fromSymbol(char symbol) {
    // Byte code:
    //   0: invokestatic getEntries : ()Lkotlin/enums/EnumEntries;
    //   3: checkcast java/lang/Iterable
    //   6: astore_2
    //   7: aload_2
    //   8: invokeinterface iterator : ()Ljava/util/Iterator;
    //   13: astore_3
    //   14: aload_3
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 63
    //   23: aload_3
    //   24: invokeinterface next : ()Ljava/lang/Object;
    //   29: astore #4
    //   31: aload #4
    //   33: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/Status
    //   36: astore #5
    //   38: iconst_0
    //   39: istore #6
    //   41: aload #5
    //   43: invokevirtual getSymbol : ()C
    //   46: iload_1
    //   47: if_icmpne -> 54
    //   50: iconst_1
    //   51: goto -> 55
    //   54: iconst_0
    //   55: ifeq -> 14
    //   58: aload #4
    //   60: goto -> 64
    //   63: aconst_null
    //   64: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/Status
    //   67: dup
    //   68: ifnonnull -> 75
    //   71: pop
    //   72: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/Status.PENDING : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/Status;
    //   75: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #41	-> 0
    //   #45	-> 38
    //   #41	-> 41
    //   #41	-> 55
    //   #41	-> 64
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   41	14	6	$i$a$-find-Status$Companion$fromSymbol$1	I
    //   38	17	5	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/Status;
    //   0	76	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/Status$Companion;
    //   0	76	1	symbol	C
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\Status$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */