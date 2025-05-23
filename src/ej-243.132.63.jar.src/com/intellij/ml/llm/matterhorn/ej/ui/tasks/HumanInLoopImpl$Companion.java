package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import com.intellij.ml.llm.matterhorn.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "checkActionWhitelist", "", "action", "", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "ej-ui"})
@SourceDebugExtension({"SMAP\nHumanInLoopImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HumanInLoopImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n31#2,2:130\n1755#3,3:132\n*S KotlinDebug\n*F\n+ 1 HumanInLoopImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion\n*L\n38#1:130,2\n40#1:132,3\n*E\n"})
public final class Companion {
  private Companion() {}
  
  public final boolean checkActionWhitelist(@NotNull String action, @NotNull ActionType actionType) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'action'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_2
    //   7: ldc 'actionType'
    //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   12: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
    //   15: checkcast com/intellij/openapi/components/ComponentManager
    //   18: astore #4
    //   20: iconst_0
    //   21: istore #5
    //   23: ldc com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
    //   25: astore #6
    //   27: aload #4
    //   29: aload #6
    //   31: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
    //   36: dup
    //   37: ifnonnull -> 49
    //   40: pop
    //   41: aload #4
    //   43: aload #6
    //   45: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
    //   48: athrow
    //   49: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
    //   52: astore_3
    //   53: aload_3
    //   54: invokevirtual getActionWhiteList : ()Ljava/util/List;
    //   57: astore #4
    //   59: aload #4
    //   61: checkcast java/lang/Iterable
    //   64: astore #5
    //   66: iconst_0
    //   67: istore #6
    //   69: aload #5
    //   71: instanceof java/util/Collection
    //   74: ifeq -> 94
    //   77: aload #5
    //   79: checkcast java/util/Collection
    //   82: invokeinterface isEmpty : ()Z
    //   87: ifeq -> 94
    //   90: iconst_0
    //   91: goto -> 147
    //   94: aload #5
    //   96: invokeinterface iterator : ()Ljava/util/Iterator;
    //   101: astore #7
    //   103: aload #7
    //   105: invokeinterface hasNext : ()Z
    //   110: ifeq -> 146
    //   113: aload #7
    //   115: invokeinterface next : ()Ljava/lang/Object;
    //   120: astore #8
    //   122: aload #8
    //   124: checkcast com/intellij/ml/llm/matterhorn/settings/ActionRule
    //   127: astore #9
    //   129: iconst_0
    //   130: istore #10
    //   132: aload #9
    //   134: aload_1
    //   135: aload_2
    //   136: invokevirtual check : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ActionType;)Z
    //   139: ifeq -> 103
    //   142: iconst_1
    //   143: goto -> 147
    //   146: iconst_0
    //   147: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #38	-> 12
    //   #130	-> 23
    //   #131	-> 27
    //   #38	-> 49
    //   #39	-> 53
    //   #40	-> 59
    //   #132	-> 69
    //   #133	-> 94
    //   #40	-> 132
    //   #133	-> 139
    //   #134	-> 146
    //   #40	-> 147
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   23	26	5	$i$f$service	I
    //   27	22	6	serviceClass$iv	Ljava/lang/Class;
    //   20	29	4	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
    //   132	7	10	$i$a$-any-HumanInLoopImpl$Companion$checkActionWhitelist$1	I
    //   129	10	9	it	Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;
    //   122	24	8	element$iv	Ljava/lang/Object;
    //   69	78	6	$i$f$any	I
    //   66	81	5	$this$any$iv	Ljava/lang/Iterable;
    //   53	95	3	settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
    //   59	89	4	whitelist	Ljava/util/List;
    //   0	148	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion;
    //   0	148	1	action	Ljava/lang/String;
    //   0	148	2	actionType	Lcom/intellij/ml/llm/matterhorn/ActionType;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\HumanInLoopImpl$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */