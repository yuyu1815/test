/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.channels.Channel;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\002\020\001*\004\b\003\020\0022\0020\003B\033\022\006\020\004\032\0028\002\022\f\020\005\032\b\022\004\022\0028\0030\006¢\006\002\020\007J\016\020\r\032\0028\002HÆ\003¢\006\002\020\013J\017\020\016\032\b\022\004\022\0028\0030\006HÆ\003J4\020\017\032\016\022\004\022\0028\002\022\004\022\0028\0030\0002\b\b\002\020\004\032\0028\0022\016\b\002\020\005\032\b\022\004\022\0028\0030\006HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\003HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\027HÖ\001R\027\020\005\032\b\022\004\022\0028\0030\006¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\0028\002¢\006\n\n\002\020\f\032\004\b\n\020\013¨\006\030"}, d2 = {"Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;", "T", "Result", "", "parameter", "channel", "Lkotlinx/coroutines/channels/Channel;", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Channel;)V", "getChannel", "()Lkotlinx/coroutines/channels/Channel;", "getParameter", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Channel;)Lai/grazie/utils/SuspendableBatchProcessor$BufferItem;", "equals", "", "other", "hashCode", "", "toString", "", "utils-common"})
/*    */ final class BufferItem<T, Result>
/*    */ {
/*    */   private final T parameter;
/*    */   @NotNull
/*    */   private final Channel<Result> channel;
/*    */   
/*    */   public BufferItem(Object parameter, @NotNull Channel<Result> channel) {
/* 38 */     this.parameter = (T)parameter; this.channel = channel; } public final T getParameter() { return this.parameter; } @NotNull public final Channel<Result> getChannel() { return this.channel; }
/*    */ 
/*    */   
/*    */   public final T component1() {
/*    */     return this.parameter;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Channel<Result> component2() {
/*    */     return this.channel;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BufferItem<T, Result> copy(Object parameter, @NotNull Channel<Result> channel) {
/*    */     Intrinsics.checkNotNullParameter(channel, "channel");
/*    */     return new BufferItem((T)parameter, channel);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "BufferItem(parameter=" + this.parameter + ", channel=" + this.channel + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.parameter == null) ? 0 : this.parameter.hashCode();
/*    */     return result * 31 + this.channel.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof BufferItem))
/*    */       return false; 
/*    */     BufferItem bufferItem = (BufferItem)other;
/*    */     return !Intrinsics.areEqual(this.parameter, bufferItem.parameter) ? false : (!!Intrinsics.areEqual(this.channel, bufferItem.channel));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$BufferItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */