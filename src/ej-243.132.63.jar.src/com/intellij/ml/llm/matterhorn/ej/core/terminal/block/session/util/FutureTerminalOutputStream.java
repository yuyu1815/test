/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.util;
/*    */ 
/*    */ import com.jediterm.terminal.TerminalOutputStream;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\002\n\000\n\002\020\022\n\002\b\003\n\002\020\016\n\000\b\000\030\0002\0020\001B\031\022\020\020\002\032\f\022\b\b\001\022\004\030\0010\0010\003¢\006\004\b\004\020\005J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\bH\026J\030\020\016\032\0020\n2\006\020\017\032\0020\0202\006\020\r\032\0020\bH\026R\030\020\002\032\f\022\b\b\001\022\004\030\0010\0010\003X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\001X\016¢\006\002\n\000R\016\020\007\032\0020\bX\016¢\006\002\n\000¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/util/FutureTerminalOutputStream;", "Lcom/jediterm/terminal/TerminalOutputStream;", "future", "Ljava/util/concurrent/CompletableFuture;", "<init>", "(Ljava/util/concurrent/CompletableFuture;)V", "resolvedValue", "isResolved", "", "sendBytes", "", "response", "", "userInput", "sendString", "string", "", "ej-core"})
/*    */ public final class FutureTerminalOutputStream implements TerminalOutputStream {
/*    */   @NotNull
/*    */   private final CompletableFuture<? extends TerminalOutputStream> future;
/*    */   
/* 12 */   public FutureTerminalOutputStream(@NotNull CompletableFuture<? extends TerminalOutputStream> future) { this.future = future;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 19 */     this.isResolved = true;
/*    */ 
/*    */     
/* 22 */     this.future.thenAccept(new Function1() {
/* 23 */           public final void invoke(TerminalOutputStream it) { FutureTerminalOutputStream.this.resolvedValue = it;
/* 24 */             FutureTerminalOutputStream.this.isResolved = true; }
/*    */         }::_init_$lambda$0); } @Nullable
/*    */   private volatile TerminalOutputStream resolvedValue; private volatile boolean isResolved; private static final void _init_$lambda$0(Function1 $tmp0, Object p0) {
/*    */     $tmp0.invoke(p0);
/*    */   } public void sendBytes(@NotNull byte[] response, boolean userInput) {
/* 29 */     Intrinsics.checkNotNullParameter(response, "response"); if (this.isResolved || this.resolvedValue != null)
/* 30 */     { if (this.resolvedValue != null) { this.resolvedValue.sendBytes(response, userInput); }
/*    */       else {  }
/*    */        }
/* 33 */     else { this.future.thenAccept(new FutureTerminalOutputStream$sendBytes$1(response, userInput)::sendBytes$lambda$1); }  } private static final void sendBytes$lambda$1(Function1 $tmp0, Object p0) { $tmp0.invoke(p0); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class FutureTerminalOutputStream$sendBytes$1 implements Function1 { FutureTerminalOutputStream$sendBytes$1(byte[] $response, boolean $userInput) {} public final void invoke(TerminalOutputStream it) { if (it != null) { it.sendBytes(this.$response, this.$userInput); }
/*    */       else
/*    */       {  }
/*    */        }
/*    */      }
/* 38 */   public void sendString(@NotNull String string, boolean userInput) { Intrinsics.checkNotNullParameter(string, "string"); if (this.isResolved || this.resolvedValue != null)
/* 39 */     { if (this.resolvedValue != null) { this.resolvedValue.sendString(string, userInput); }
/*    */       else {  }
/*    */        }
/* 42 */     else { this.future.thenAccept(new FutureTerminalOutputStream$sendString$1(string, userInput)::sendString$lambda$2); }  } private static final void sendString$lambda$2(Function1 $tmp0, Object p0) { $tmp0.invoke(p0); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class FutureTerminalOutputStream$sendString$1 implements Function1 { FutureTerminalOutputStream$sendString$1(String $string, boolean $userInput) {} public final void invoke(TerminalOutputStream it) { if (it != null) { it.sendString(this.$string, this.$userInput); }
/*    */       else
/*    */       {  }
/*    */        }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\sessio\\util\FutureTerminalOutputStream.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */