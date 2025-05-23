/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableThrowable;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("ErrorCheckerFinished")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\0012\0020\002:\002)*B\033\022\006\020\003\032\0020\004\022\n\b\002\020\005\032\004\030\0010\006¢\006\004\b\007\020\bB/\b\020\022\006\020\t\032\0020\n\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0010\006\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\030\032\0020\004HÆ\003J\013\020\031\032\004\030\0010\006HÆ\003J\037\020\032\032\0020\0002\b\b\002\020\003\032\0020\0042\n\b\002\020\005\032\004\030\0010\006HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020\nHÖ\001J\t\020 \032\0020\004HÖ\001J%\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'H\001¢\006\002\b(R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\016\020\017R\023\020\005\032\004\030\0010\006¢\006\b\n\000\032\004\b\020\020\021R\024\020\022\032\0020\0048VX\004¢\006\006\032\004\b\023\020\017R\024\020\024\032\0020\0258VX\004¢\006\006\032\004\b\026\020\027¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerFinished;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "name", "", "error", "Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getError", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;", "groupKey", "getGroupKey", "type", "Lcom/intellij/ml/llm/matterhorn/EventType;", "getType", "()Lcom/intellij/ml/llm/matterhorn/EventType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class ErrorCheckerFinished implements CustomArtifactEventSerializable, PairedGroupEvent {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 20 */   public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } @NotNull private final String name; @Nullable private final SerializableThrowable error; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerFinished$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerFinished;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ErrorCheckerFinished> serializer() { return (KSerializer<ErrorCheckerFinished>)ErrorCheckerFinished.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 23 */   public ErrorCheckerFinished(@NotNull String name, @Nullable SerializableThrowable error) { this.name = name;
/* 24 */     this.error = error; } @NotNull public final String getName() { return this.name; } @Nullable public final SerializableThrowable getError() { return this.error; }
/*    */   
/*    */   @NotNull
/* 27 */   public String getGroupKey() { return "ErrorChecker"; } @NotNull
/*    */   public EventType getType() {
/* 29 */     return EventType.End;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SerializableThrowable component2() {
/*    */     return this.error;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ErrorCheckerFinished copy(@NotNull String name, @Nullable SerializableThrowable error) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     return new ErrorCheckerFinished(name, error);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ErrorCheckerFinished(name=" + this.name + ", error=" + this.error + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     return result * 31 + ((this.error == null) ? 0 : this.error.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ErrorCheckerFinished))
/*    */       return false; 
/*    */     ErrorCheckerFinished errorCheckerFinished = (ErrorCheckerFinished)other;
/*    */     return !Intrinsics.areEqual(this.name, errorCheckerFinished.name) ? false : (!!Intrinsics.areEqual(this.error, errorCheckerFinished.error));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\ErrorCheckerFinished.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */