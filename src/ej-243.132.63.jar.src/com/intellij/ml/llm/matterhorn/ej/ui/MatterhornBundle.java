/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.DynamicBundle;
/*    */ import java.util.Arrays;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.PropertyKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\021\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J+\020\006\032\0020\0072\b\b\001\020\b\032\0020\0072\022\020\t\032\n\022\006\b\001\022\0020\0010\n\"\0020\001H\007¢\006\002\020\013R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornBundle;", "", "<init>", "()V", "dynamicBundle", "Lcom/intellij/DynamicBundle;", "message", "", "key", "params", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class MatterhornBundle {
/*    */   @NotNull
/* 13 */   public static final MatterhornBundle INSTANCE = new MatterhornBundle(); @NotNull private static final DynamicBundle dynamicBundle = new DynamicBundle(MatterhornBundle.class, "messages.MatterhornBundle"); public static final int $stable = 8;
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final String message(@PropertyKey(resourceBundle = "messages.MatterhornBundle") @NotNull String key, @NotNull Object... params) {
/* 17 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(params, "params"); return dynamicBundle.getMessage(key, Arrays.copyOf(params, params.length));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornBundle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */