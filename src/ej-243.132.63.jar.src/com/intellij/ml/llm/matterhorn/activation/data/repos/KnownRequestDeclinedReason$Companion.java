package com.intellij.ml.llm.matterhorn.activation.data.repos;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\004\030\0010\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason$Companion;", "", "<init>", "()V", "fromErrorCode", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason;", "errorCode", "", "data.repos"})
@SourceDebugExtension({"SMAP\nJunieAipLicenseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
public final class Companion {
  private Companion() {}
  
  @Nullable
  public final KnownRequestDeclinedReason fromErrorCode(@NotNull String errorCode) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'errorCode'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: invokestatic getEntries : ()Lkotlin/enums/EnumEntries;
    //   9: checkcast java/lang/Iterable
    //   12: astore_2
    //   13: aload_2
    //   14: invokeinterface iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 64
    //   29: aload_3
    //   30: invokeinterface next : ()Ljava/lang/Object;
    //   35: astore #4
    //   37: aload #4
    //   39: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason
    //   42: astore #5
    //   44: iconst_0
    //   45: istore #6
    //   47: aload #5
    //   49: invokevirtual getErrorCode : ()Ljava/lang/String;
    //   52: aload_1
    //   53: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   56: ifeq -> 20
    //   59: aload #4
    //   61: goto -> 65
    //   64: aconst_null
    //   65: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason
    //   68: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #186	-> 6
    //   #209	-> 44
    //   #186	-> 47
    //   #186	-> 56
    //   #186	-> 68
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   47	9	6	$i$a$-find-KnownRequestDeclinedReason$Companion$fromErrorCode$1	I
    //   44	12	5	it	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason;
    //   0	69	0	this	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/KnownRequestDeclinedReason$Companion;
    //   0	69	1	errorCode	Ljava/lang/String;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\KnownRequestDeclinedReason$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */