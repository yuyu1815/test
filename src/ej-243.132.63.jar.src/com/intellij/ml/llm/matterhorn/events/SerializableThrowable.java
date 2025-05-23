/*    */ package com.intellij.ml.llm.matterhorn.events;
/*    */ @Serializable
/*    */ @SerialName("SerializableThrowable")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\b\004\n\002\020\003\n\000\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\024\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002/0BA\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\000\022\016\b\002\020\006\032\b\022\004\022\0020\0000\007\022\b\b\002\020\b\032\0020\003¢\006\004\b\t\020\nB\031\b\026\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016¢\006\004\b\t\020\017BS\b\020\022\006\020\020\032\0020\021\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\000\022\016\020\006\032\n\022\004\022\0020\000\030\0010\007\022\b\020\b\032\004\030\0010\003\022\b\020\022\032\004\030\0010\023¢\006\004\b\t\020\024J\t\020\035\032\0020\003HÆ\003J\013\020\036\032\004\030\0010\003HÆ\003J\013\020\037\032\004\030\0010\000HÆ\003J\017\020 \032\b\022\004\022\0020\0000\007HÆ\003J\t\020!\032\0020\003HÆ\003JE\020\"\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\0002\016\b\002\020\006\032\b\022\004\022\0020\0000\0072\b\b\002\020\b\032\0020\003HÆ\001J\023\020#\032\0020\0162\b\020$\032\004\030\0010\001HÖ\003J\t\020%\032\0020\021HÖ\001J\t\020&\032\0020\003HÖ\001J%\020'\032\0020(2\006\020)\032\0020\0002\006\020*\032\0020+2\006\020,\032\0020-H\001¢\006\002\b.R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\025\020\026R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\027\020\026R\023\020\005\032\004\030\0010\000¢\006\b\n\000\032\004\b\030\020\031R\027\020\006\032\b\022\004\022\0020\0000\007¢\006\b\n\000\032\004\b\032\020\033R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\034\020\026¨\0061"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "", "exceptionClassName", "", "message", "cause", "suppressedExceptions", "", "stackTrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;Ljava/util/List;Ljava/lang/String;)V", "throwable", "", "addStacktrace", "", "(Ljava/lang/Throwable;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getExceptionClassName", "()Ljava/lang/String;", "getMessage", "getCause", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "getSuppressedExceptions", "()Ljava/util/List;", "getStackTrace", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "Companion", "$serializer", "core"})
/*    */ @SourceDebugExtension({"SMAP\nSerializableThrowable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializableThrowable.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,32:1\n1#2:33\n11165#3:34\n11500#3,3:35\n*S KotlinDebug\n*F\n+ 1 SerializableThrowable.kt\ncom/intellij/ml/llm/matterhorn/events/SerializableThrowable\n*L\n23#1:34\n23#1:35,3\n*E\n"})
/*    */ public final class SerializableThrowable { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String exceptionClassName;
/*    */   @Nullable
/*    */   private final String message;
/*    */   
/* 13 */   public SerializableThrowable(@NotNull String exceptionClassName, @Nullable String message, @Nullable SerializableThrowable cause, @NotNull List<SerializableThrowable> suppressedExceptions, @NotNull String stackTrace) { this.exceptionClassName = exceptionClassName;
/* 14 */     this.message = message;
/* 15 */     this.cause = cause;
/* 16 */     this.suppressedExceptions = suppressedExceptions;
/* 17 */     this.stackTrace = stackTrace; } @Nullable private final SerializableThrowable cause; @NotNull private final List<SerializableThrowable> suppressedExceptions; @NotNull private final String stackTrace; @NotNull public final String getExceptionClassName() { return this.exceptionClassName; } @Nullable public final String getMessage() { return this.message; } @Nullable public final SerializableThrowable getCause() { return this.cause; } @NotNull public final List<SerializableThrowable> getSuppressedExceptions() { return this.suppressedExceptions; } @NotNull public final String getStackTrace() { return this.stackTrace; }
/*    */    public SerializableThrowable(@NotNull Throwable throwable, boolean addStacktrace) {
/* 19 */     this(
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
/* 34 */         str1, str2, serializableThrowable2, list, addStacktrace ? ExceptionsKt.stackTraceToString(throwable) : "");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.exceptionClassName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.message;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SerializableThrowable component3() {
/*    */     return this.cause;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<SerializableThrowable> component4() {
/*    */     return this.suppressedExceptions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.stackTrace;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SerializableThrowable copy(@NotNull String exceptionClassName, @Nullable String message, @Nullable SerializableThrowable cause, @NotNull List<SerializableThrowable> suppressedExceptions, @NotNull String stackTrace) {
/*    */     Intrinsics.checkNotNullParameter(exceptionClassName, "exceptionClassName");
/*    */     Intrinsics.checkNotNullParameter(suppressedExceptions, "suppressedExceptions");
/*    */     Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
/*    */     return new SerializableThrowable(exceptionClassName, message, cause, suppressedExceptions, stackTrace);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SerializableThrowable(exceptionClassName=" + this.exceptionClassName + ", message=" + this.message + ", cause=" + this.cause + ", suppressedExceptions=" + this.suppressedExceptions + ", stackTrace=" + this.stackTrace + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.exceptionClassName.hashCode();
/*    */     result = result * 31 + ((this.message == null) ? 0 : this.message.hashCode());
/*    */     result = result * 31 + ((this.cause == null) ? 0 : this.cause.hashCode());
/*    */     result = result * 31 + this.suppressedExceptions.hashCode();
/*    */     return result * 31 + this.stackTrace.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SerializableThrowable))
/*    */       return false; 
/*    */     SerializableThrowable serializableThrowable = (SerializableThrowable)other;
/*    */     return !Intrinsics.areEqual(this.exceptionClassName, serializableThrowable.exceptionClassName) ? false : (!Intrinsics.areEqual(this.message, serializableThrowable.message) ? false : (!Intrinsics.areEqual(this.cause, serializableThrowable.cause) ? false : (!Intrinsics.areEqual(this.suppressedExceptions, serializableThrowable.suppressedExceptions) ? false : (!!Intrinsics.areEqual(this.stackTrace, serializableThrowable.stackTrace)))));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\003\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\f\020\b\032\b\022\004\022\0020\0050\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable$Companion;", "", "<init>", "()V", "withStacktrace", "Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "throwable", "", "serializer", "Lkotlinx/serialization/KSerializer;", "core"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SerializableThrowable> serializer() {
/*    */       return (KSerializer<SerializableThrowable>)SerializableThrowable.$serializer.INSTANCE;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final SerializableThrowable withStacktrace(@NotNull Throwable throwable) {
/*    */       Intrinsics.checkNotNullParameter(throwable, "throwable");
/*    */       return new SerializableThrowable(throwable, true);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\events\SerializableThrowable.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */