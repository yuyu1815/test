/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\001\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\000\032\031\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\b\032\037\020\005\032\0020\0012\f\020\006\032\b\022\004\022\0020\0030\0072\006\020\004\032\0020\003H\b¨\006\b"}, d2 = {"keyNotFound", "", "key", "", "type", "keysNotFound", "keys", "", "ide-laf-bridge"})
/*    */ public final class JewelBridgeExceptionKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Void keyNotFound(@NotNull String key, @NotNull String type) {
/* 16 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(type, "type"); int $i$f$keyNotFound = 0; throw new JewelBridgeException.KeyNotFoundException(key, type);
/*    */   }
/*    */   @NotNull
/*    */   public static final Void keysNotFound(@NotNull List keys, @NotNull String type) {
/* 20 */     Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(type, "type"); int $i$f$keysNotFound = 0; throw new JewelBridgeException.KeysNotFoundException(keys, type);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\JewelBridgeExceptionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */