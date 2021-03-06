/*
 * MIT License
 *
 * Copyright (c) 2021 The GMCBM Authors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package net.gmcbm.core.mute;

import net.gmcbm.core.item.Item;
import net.gmcbm.core.item.ItemAction;
import net.gmcbm.core.item.ItemStatus;
import net.gmcbm.core.item.OriginType;
import net.gmcbm.core.server.Server;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.time.Instant;
import java.util.UUID;

/**
 * @author Ursin Filli
 * @version 1.0
 * @since 1.0
 */
public class Mute extends Item {

    /**
     * Constructor of {@link Mute}
     *
     * @param id         Mute Identifier
     * @param player     {@link UUID} of Player
     * @param reason     Reason
     * @param issuer     Issuer {@link UUID} or null
     * @param issuerName Issuer Name
     * @param from       From {@link Instant}
     * @param until      Until {@link Instant}
     * @param status     Status ({@link ItemStatus})
     * @param action     Action ({@link ItemAction})
     * @param timestamp  Timestamp ({@link Instant})
     * @param origin     Origin ({@link OriginType})
     * @param server     Server ({@link Server})
     */
    public Mute(@Nonnull String id, @Nonnull UUID player, @Nonnull String reason, @Nullable UUID issuer,
                @Nonnull String issuerName, @Nonnull Instant from, @Nonnull Instant until,
                @Nonnull ItemStatus status, @Nonnull ItemAction action, @Nonnull Instant timestamp,
                @Nonnull OriginType origin, @Nonnull Server server) {
        super(id, player, reason, issuer, issuerName, from, until, status, action, timestamp, origin, server);
    }

    /**
     * Constructor of {@link Mute}
     *
     * @param player     {@link UUID} of Player
     * @param reason     Reason
     * @param issuer     Issuer {@link UUID} or null
     * @param issuerName Issuer Name
     * @param from       From {@link Instant}
     * @param until      Until {@link Instant}
     * @param server     Server ({@link Server})
     */
    public Mute(@Nonnull UUID player, @Nonnull String reason, @Nullable UUID issuer, @Nonnull String issuerName,
                @Nonnull Instant from, @Nonnull Instant until, @Nonnull Server server) {
        super(player, reason, issuer, issuerName, from, until, server);
    }
}
